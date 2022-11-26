package com.abkkm.resilience;

public interface QuoteService {
	public int getQuote();
	public int getQuoteFallback(Throwable t) throws InterruptedException;
}
