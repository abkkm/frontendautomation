package com.abkkm.springrsocket.controller;

import com.abkkm.springrsocket.dto.ChartResponseDto;
import com.abkkm.springrsocket.dto.ComputationRequestDto;
import com.abkkm.springrsocket.dto.ComputationResponseDto;
import com.abkkm.springrsocket.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class MathController {

    @Autowired
    private MathService service;

    @MessageMapping("math.service.print")
    public Mono<Void> print(Mono<ComputationRequestDto> requestDtoMono){
        return this.service.print(requestDtoMono);
    }

    @MessageMapping("math.service.square")
    public Mono<ComputationResponseDto> findSquare(Mono<ComputationRequestDto> requestDtoMono){
        return this.service.findSquare(requestDtoMono);
    }

    @MessageMapping("math.service.table")
    public Flux<ComputationResponseDto> tableStream(Mono<ComputationRequestDto> requestDtoMono){
        return requestDtoMono.flatMapMany(this.service::tableStream);
    }

    @MessageMapping("math.service.chart")
    public Flux<ChartResponseDto> chartStream(Flux<ComputationRequestDto> requestDtoFlux){
        return this.service.chartStream(requestDtoFlux);
    }

}
