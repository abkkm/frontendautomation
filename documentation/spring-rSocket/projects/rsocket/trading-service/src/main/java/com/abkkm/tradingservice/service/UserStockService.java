package com.abkkm.tradingservice.service;

import com.abkkm.tradingservice.dto.StockTradeRequest;
import com.abkkm.tradingservice.dto.UserStockDto;
import com.abkkm.tradingservice.entity.UserStock;
import com.abkkm.tradingservice.repository.UserStockRepository;
import com.abkkm.tradingservice.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserStockService {

    @Autowired
    private UserStockRepository stockRepository;

    public Flux<UserStockDto> getUserStocks(String userId){
        return this.stockRepository.findByUserId(userId)
                        .map(EntityDtoUtil::toUserStockDto);
    }

    // buy
    public Mono<UserStock> buyStock(StockTradeRequest request){
        return this.stockRepository.findByUserIdAndStockSymbol(request.getUserId(), request.getStockSymbol())
                    .defaultIfEmpty(EntityDtoUtil.toUserStock(request))
                    .doOnNext(us -> us.setQuantity(us.getQuantity() + request.getQuantity()))
                    .flatMap(this.stockRepository::save);
    }

    // sell
    public Mono<UserStock> sellStock(StockTradeRequest request){
        return this.stockRepository.findByUserIdAndStockSymbol(request.getUserId(), request.getStockSymbol())
                        .filter(us -> us.getQuantity() >= request.getQuantity())
                        .doOnNext(us -> us.setQuantity(us.getQuantity() - request.getQuantity()))
                        .flatMap(this.stockRepository::save);
    }

}
