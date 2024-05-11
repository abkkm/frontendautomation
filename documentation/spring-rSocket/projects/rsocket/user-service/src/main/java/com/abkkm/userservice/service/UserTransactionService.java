package com.abkkm.userservice.service;

import com.abkkm.userservice.dto.TransactionRequest;
import com.abkkm.userservice.dto.TransactionResponse;
import com.abkkm.userservice.dto.TransactionStatus;
import com.abkkm.userservice.dto.TransactionType;
import com.abkkm.userservice.entity.User;
import com.abkkm.userservice.repository.UserRepository;
import com.abkkm.userservice.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.function.UnaryOperator;

@Service
public class UserTransactionService {

    @Autowired
    private UserRepository repository;

    public Mono<TransactionResponse> doTransaction(TransactionRequest request){
        UnaryOperator<Mono<User>> operation = TransactionType.CREDIT.equals(request.getType()) ? credit(request) : debit(request);
        return this.repository.findById(request.getUserId())
                    .transform(operation)
                    .flatMap(this.repository::save)
                    .map(s -> EntityDtoUtil.toResponse(request, TransactionStatus.COMPLETED))
                    .defaultIfEmpty(EntityDtoUtil.toResponse(request, TransactionStatus.FAILED));
    }

    private UnaryOperator<Mono<User>> credit(TransactionRequest request){
        return userMono -> userMono
                                .doOnNext(u -> u.setBalance(u.getBalance() + request.getAmount()));
    }

    private UnaryOperator<Mono<User>> debit(TransactionRequest request){
        return userMono -> userMono
                                .filter(u -> u.getBalance() >= request.getAmount())
                                .doOnNext(u -> u.setBalance(u.getBalance() - request.getAmount()));
    }


}
