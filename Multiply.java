package com.MainPage;

public class Multiply {
	private int multiply_First;
	private int multiply_Second;
	
	public Multiply(int multiply_First, int multiply_Second) {
		super();
		this.multiply_First = multiply_First;
		this.multiply_Second = multiply_Second;
	}
	
	public int getMultiply_First() {
		return multiply_First;
	}
	public void setMultiply_First(int multiply_First) {
		this.multiply_First = multiply_First;
	}
	public int getMultiply_Second() {
		return multiply_Second;
	}
	public void setMultiply_Second(int multiply_Second) {
		this.multiply_Second = multiply_Second;
	}
	
	public int multi(){
		int multiply = 1;
		multiply = multiply_First*multiply_Second;
		return multiply;
	}

}
