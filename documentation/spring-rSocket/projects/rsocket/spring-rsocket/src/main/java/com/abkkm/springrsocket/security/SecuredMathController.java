package com.abkkm.springrsocket.security;

import com.abkkm.springrsocket.dto.ComputationRequestDto;
import com.abkkm.springrsocket.dto.ComputationResponseDto;
import com.abkkm.springrsocket.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@MessageMapping("math.service.secured")
public class SecuredMathController {

    @Autowired
    private MathService service;

    @PreAuthorize("hasRole('USER')")
    @MessageMapping("square")
    public Mono<ComputationResponseDto> findSquare(Mono<ComputationRequestDto> requestDtoMono,
                                                   @AuthenticationPrincipal Mono<UserDetails> userDetailsMono){
        userDetailsMono.doOnNext(System.out::println).subscribe();
        return this.service.findSquare(requestDtoMono);
    }

    @MessageMapping("table")
    public Flux<ComputationResponseDto> tableStream(Mono<ComputationRequestDto> requestDtoMono){
        return requestDtoMono.flatMapMany(this.service::tableStream);
    }

}
