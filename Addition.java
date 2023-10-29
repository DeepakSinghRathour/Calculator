package com.MainPage;

public class Addition {
	private int add_First;
	private int add_Second;
	
	public Addition(int add_First, int add_Second){
		super();
		this.add_First = add_First;
		this.add_Second = add_Second;
	}
	
	public int getAdd_First() {
		return add_First;
	}

	public void setAdd_First(int add_First) {
		this.add_First = add_First;
	}

	public int getAdd_Second() {
		return add_Second;
	}

	public void setAdd_Second(int add_Second) {
		this.add_Second = add_Second;
	}

	public int add() {
		int sum=0;
		sum = add_First+add_Second;
		return sum;
	}
}
