package com.MainPage;

public class Square {
	private int square;

	public Square(int square) {
		super();
		this.square = square;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
	public int square() {
		int Final_square = square*square;
		return Final_square;
	}

}
