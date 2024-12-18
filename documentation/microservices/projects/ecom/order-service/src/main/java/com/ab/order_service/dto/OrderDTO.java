package com.ab.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
	private Long orderId; 
	private Long productId; 
	private int quantity; 
	private double totalPrice;
	// product details
	private String productName; 
	private double productPrice;	

}
