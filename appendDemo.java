package com.example;

public class appendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int a = 42;
		StringBuffer sb = new StringBuffer(2);
		
		s=sb.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(sb);
		

	}

}
