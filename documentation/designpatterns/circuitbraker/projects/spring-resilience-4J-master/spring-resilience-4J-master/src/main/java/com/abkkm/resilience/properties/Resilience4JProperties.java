package com.abkkm.resilience.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ConfigurationProperties("resilience")
@Getter
@Setter
@Primary
public class Resilience4JProperties {

    public float getFailureRateThreshold() {
		return failureRateThreshold;
	}

	public void setFailureRateThreshold(float failureRateThreshold) {
		this.failureRateThreshold = failureRateThreshold;
	}

	public long getSlowCallDurationThreshold() {
		return slowCallDurationThreshold;
	}

	public void setSlowCallDurationThreshold(long slowCallDurationThreshold) {
		this.slowCallDurationThreshold = slowCallDurationThreshold;
	}

	public long getWaitDurationInOpenState() {
		return waitDurationInOpenState;
	}

	public void setWaitDurationInOpenState(long waitDurationInOpenState) {
		this.waitDurationInOpenState = waitDurationInOpenState;
	}

	public int getMinimumNumberOfCalls() {
		return minimumNumberOfCalls;
	}

	public void setMinimumNumberOfCalls(int minimumNumberOfCalls) {
		this.minimumNumberOfCalls = minimumNumberOfCalls;
	}

	public int getSlidingWindowSize() {
		return slidingWindowSize;
	}

	public void setSlidingWindowSize(int slidingWindowSize) {
		this.slidingWindowSize = slidingWindowSize;
	}

	public int getPermittedNumberOfCallsInHalfOpenState() {
		return permittedNumberOfCallsInHalfOpenState;
	}

	public void setPermittedNumberOfCallsInHalfOpenState(int permittedNumberOfCallsInHalfOpenState) {
		this.permittedNumberOfCallsInHalfOpenState = permittedNumberOfCallsInHalfOpenState;
	}

	public long getTimeoutDuration() {
		return timeoutDuration;
	}

	public void setTimeoutDuration(long timeoutDuration) {
		this.timeoutDuration = timeoutDuration;
	}

	private float failureRateThreshold = 50;

    private long slowCallDurationThreshold = 4000;

    private long waitDurationInOpenState = 2000;

    private int minimumNumberOfCalls = 2;

    private int slidingWindowSize = 2;

    private int permittedNumberOfCallsInHalfOpenState = 2;

    private long timeoutDuration = 10;
}
