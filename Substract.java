package com.MainPage;

public class Substract {
	private int substract_First;
	private int substract_Second;
	
	public Substract(int substract_First, int substract_Second) {
		super();
		this.substract_First =  substract_First;
		this.substract_Second = substract_Second;
	}
	
	public int getSubstract_First() {
		return substract_First;
	}
	public void setSubstract_First(int substract_First) {
		this.substract_First = substract_First;
	}
	public int getSubstract_Second() {
		return substract_Second;
	}
	public void setSubstract_Second(int substract_Second) {
		this.substract_Second = substract_Second;
	}
	
	public int subs(){
		int substraction = 0;
		substraction = substract_First-substract_Second;
		return substraction;
	}

}
