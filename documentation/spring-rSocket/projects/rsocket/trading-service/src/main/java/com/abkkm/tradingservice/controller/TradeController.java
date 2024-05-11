package com.abkkm.tradingservice.controller;

import com.abkkm.tradingservice.client.StockClient;
import com.abkkm.tradingservice.dto.StockTickDto;
import com.abkkm.tradingservice.dto.StockTradeRequest;
import com.abkkm.tradingservice.dto.StockTradeResponse;
import com.abkkm.tradingservice.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("stock")
public class TradeController {

    @Autowired
    private StockClient stockClient;

    @Autowired
    private TradeService tradeService;

    @GetMapping(value = "tick/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<StockTickDto> stockTicks(){
        return this.stockClient.getStockStream();
    }

    @PostMapping("trade")
    public Mono<ResponseEntity<StockTradeResponse>> trade(@RequestBody Mono<StockTradeRequest> tradeRequestMono){
        return tradeRequestMono
                .filter(tr -> tr.getQuantity() > 0)
                .flatMap(this.tradeService::trade)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }

}
