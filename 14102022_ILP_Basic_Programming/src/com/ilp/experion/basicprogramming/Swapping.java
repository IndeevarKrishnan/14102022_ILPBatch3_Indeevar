package com.ilp.experion.basicprogramming;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int temp;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		num1= scanner.nextInt();
		System.out.println("Enter number 2 : ");
		num2= scanner.nextInt();
		System.out.println("number 1 : "+num1);
		System.out.println("number 2 : "+num2);
		temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("after swpping ");
		System.out.println("number 1 : "+num1);
		System.out.println("number 2 : "+num2);
	}

}
