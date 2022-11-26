package com.abkkm.resilience.config.fallback;


public class GenericFallback implements Fallback {

    @Override
    public Object fallBack(Throwable throwable) {
        return throwable.getCause();
    }
}
