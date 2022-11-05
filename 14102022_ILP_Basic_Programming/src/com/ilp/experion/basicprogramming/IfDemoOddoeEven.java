package com.ilp.experion.basicprogramming;

import java.util.Scanner;

public class IfDemoOddoeEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		//int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number - ");
		number=scanner.nextInt();
		if((number % 2) == 0)
		{
			System.out.println("Even");
		}
		System.out.println("Odd");
	}

}
