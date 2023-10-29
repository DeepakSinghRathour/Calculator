package com.MainPage;

public class Division {
	private float division_First;
	private float division_Second;
	
	public Division(float division_First, float division_Second) {
		super();
		this.division_First = division_First;
		this.division_Second = division_Second;
	}
	
	public float getDivision_First() {
		return division_First;
	}
	
	public void setDivision_First(float division_First) {
		this.division_First = division_First;
	}
	
	public float getDivision_Second() {
		return division_Second;
	}
	
	public void setDivision_Second(float division_Second) {
		this.division_Second = division_Second;
	}
	
	public float div() {
		float division = division_First/division_Second;
		return division;
	}

}
