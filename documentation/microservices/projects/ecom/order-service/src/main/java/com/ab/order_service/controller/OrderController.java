package com.ab.order_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.ab.order_service.dto.OrderDTO;
import com.ab.order_service.dto.ProductDTO;
import com.ab.order_service.entity.Order;
import com.ab.order_service.repository.OrderRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private WebClient.Builder webClientBuilder;

	// create a method to place order
	@PostMapping("/placeOrder")
	public Mono<ResponseEntity<OrderDTO>> placeOrder(@RequestBody Order order) {
		// Fetch poduct details from product service
		return webClientBuilder.build().get().uri("http://localhost:8081/products/" + order.getProductId()).retrieve()
				.bodyToMono(ProductDTO.class).map(productDTO -> {
					OrderDTO responseDTO = new OrderDTO();
					
					responseDTO.setProductId(order.getProductId());
					responseDTO.setQuantity(order.getQuantity());
					// set product details
					responseDTO.setProductName(productDTO.getName());
					responseDTO.setProductPrice(productDTO.getPrice());
					responseDTO.setTotalPrice(order.getQuantity() * productDTO.getPrice());
					// save order details to DB
					orderRepository.save(order);
					responseDTO.setOrderId(order.getId());
					return ResponseEntity.ok(responseDTO);
				});

	}

	// Get All Orders @GetMapping
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
}
