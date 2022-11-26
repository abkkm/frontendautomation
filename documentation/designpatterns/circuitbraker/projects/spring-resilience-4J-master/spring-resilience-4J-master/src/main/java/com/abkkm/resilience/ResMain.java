package com.abkkm.resilience;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.vavr.control.Try;

public class ResMain implements QuoteService {
	
	
	
	private String productName;

	public static void main(String[] args) {
	
		//Order - inventory
		
		List<String> products = List.of("Soap", "Tooth Paste", "Biscuit", "Pepsi", "Coke", "Tea", "Tea1","Tea2","Tea3","Tea4");
		ResMain quoteService = new ResMain();
		
		//Circuit breaker configuration
		
		CircuitBreakerConfig circuitBreakerConfig =  CircuitBreakerConfig.custom()
	            .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
	            .automaticTransitionFromOpenToHalfOpenEnabled(true)
	            .slidingWindowSize(10)
	            .minimumNumberOfCalls(5)
	            .failureRateThreshold(50)
	            .permittedNumberOfCallsInHalfOpenState(3)
	            .waitDurationInOpenState(Duration.ofSeconds(10))
	            .build();
		//Circuit breaker registry
		
		CircuitBreakerRegistry registry = CircuitBreakerRegistry.of(circuitBreakerConfig);
		
		
		//Circuit breaker
		
		CircuitBreaker circuitBreaker = registry.circuitBreaker("myCircuitBreaker");
		
		//Supplier - decorate our method with supplier
		
		Supplier<Integer> supplier = CircuitBreaker.decorateSupplier(circuitBreaker, quoteService::getQuote);
		
		//Call the method
		
		for(String product:products) {
			quoteService.setProductName(product);
			Try.ofSupplier(supplier).recover(t -> {
				try {
					return quoteService.getQuoteFallback(t);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return null;
			});
		}
		
		

	}

	@Override
	public int getQuote() {
		
		System.out.println("------Inside getQuote--"+this.getProductName());
		if(getProductName().equalsIgnoreCase("Soap")){
			return new Random().nextInt(100);
		}
		else if(getProductName().equalsIgnoreCase("Tooth Paste")) {
			return new Random().nextInt(100);
		}
		else {
			throw new RuntimeException("Product Not available");
		}
			
	}
	
	@Override
	public int getQuoteFallback(Throwable t) throws InterruptedException {
		
		System.out.println("+++++++++Inside getQuoteFallback-"+this.getProductName());
		if(getProductName().equalsIgnoreCase("Coke")){
			Thread.sleep(5000);
		}
		if(getProductName().equalsIgnoreCase("Soap")){
			return 10;
		}
		if(getProductName().equalsIgnoreCase("Soap")){
			return 10;
		}
		else if(getProductName().equalsIgnoreCase("Tooth Paste")) {
			return 20;
		}
		return 0;
			
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
