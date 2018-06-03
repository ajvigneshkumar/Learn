package com.example;

public class Fibonacci {
	
	static int a=-1, b=1,c;
	static int count=0;
	public static void fibonacci (int n) {
		
		
			c=a+b;
			System.out.println(c+"  ");
			count++; 
			if(count< n) {
				a=b; b= c;
				fibonacci(n);
			}
		
	}
	
	public static void main(String args[]) {
		int n = 10;
		System.out.println("The fibonacci series for "+n+" numbers are:");
		fibonacci(n);
		
	}

}
