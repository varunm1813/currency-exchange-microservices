package com.varunmara.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public LimitConfiguration(int max, int min){
		this.maximum = max;
		this.minimum = min;
	}
}
