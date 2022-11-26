package com.abkkm.resilience.config.fallback;

public interface Fallback {
    Object fallBack(Throwable throwable);
}
