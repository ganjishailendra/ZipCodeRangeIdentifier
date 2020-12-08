package com.wsi.shipping.zipcode;

public class ZipcodeRange {

	private int startValue;
	private int endValue;
	
	public int getStartValue() {
		return startValue;
	}
	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}
	public int getEndValue() {
		return endValue;
	}
	public void setEndValue(int endValue) {
		this.endValue = endValue;
	}
	
	@Override
	public String toString() {
		return "[" + this.startValue + "," + this.endValue + "]";
	}
}
