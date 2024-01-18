package com.model;

public class Test {

	public static void main(String[] args) {
		System.out.println("1,");
		int j=1,k=0;
		for(int i=0; i<=10; i++)
		{
			int m=j+k;
			System.out.println(m+",");
			k=j;
			j=m;
		}
	}
}
