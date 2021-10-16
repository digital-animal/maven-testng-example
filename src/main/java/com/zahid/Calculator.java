package com.zahid;

public class Calculator {
	public int add(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int mul(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		if(y != 0) {
			return x / y;
		}
		return 0;
	}
	
	public int mod(int x, int y) {
		if(y != 0) {
			return x % y;
		}
		return 0;
	}
}
