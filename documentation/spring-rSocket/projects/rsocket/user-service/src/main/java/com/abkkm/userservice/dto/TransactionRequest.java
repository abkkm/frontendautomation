package com.abkkm.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {

    private String userId;
    private int amount;
    private TransactionType type;

}
