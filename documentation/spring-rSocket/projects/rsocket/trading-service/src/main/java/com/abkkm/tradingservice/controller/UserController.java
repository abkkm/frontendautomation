package com.abkkm.tradingservice.controller;

import com.abkkm.tradingservice.client.UserClient;
import com.abkkm.tradingservice.dto.UserDto;
import com.abkkm.tradingservice.dto.UserStockDto;
import com.abkkm.tradingservice.service.UserStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserClient userClient;

    @Autowired
    private UserStockService userStockService;

    @GetMapping("all")
    public Flux<UserDto> allUsers(){
        return this.userClient.allUsers();
    }

    @GetMapping("{userId}/stocks")
    public Flux<UserStockDto> getUserStocks(@PathVariable String userId){
        return this.userStockService.getUserStocks(userId);
    }

}
