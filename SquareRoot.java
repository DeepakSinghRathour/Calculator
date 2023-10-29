package com.MainPage;

public class SquareRoot {
	private double squareRoot;

	public SquareRoot(double squareRoot) {
		super();
		this.squareRoot = squareRoot;
	}

	public double getSquareRoot() {
		return squareRoot;
	}

	public void setSquareRoot(double squareRoot) {
		this.squareRoot = squareRoot;
	}
	
	public double sr() {
		double s = Math.pow(squareRoot, 0.5);
		return s;
	}
}
