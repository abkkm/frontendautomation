package com.abkkm.resilience.annotation;

import com.abkkm.resilience.config.fallback.Fallback;
import com.abkkm.resilience.config.fallback.GenericFallback;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableCircuitBreaker {
    String name() default "circuitBreaker";

    Class<? extends Fallback> fallbackClass() default GenericFallback.class;
}
