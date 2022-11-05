package com.ilp.experion.basicprogramming;

import java.util.Scanner;

public class SecondSmallest {public static void main(String[] args) {
	int a, b, c, smallest, temp;  
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the first number:");  
	a = scanner.nextInt();  
	System.out.println("Enter the second number:");  
	b = scanner.nextInt();  
	System.out.println("Enter the third number:");  
	c = scanner.nextInt(); 
	if ((a>b)&&(b>c)) {
		System.out.println(b + " 2nd largest");
	} 
	else if((b>a)&&(a>c)){
		System.out.println(a + " 2nd largest");	}
	else if((b>c)&&(c>a)){
		System.out.println(c + " 2nd largest");	}
	else {
		System.out.println( " Nos r same");
	}	
}
}
