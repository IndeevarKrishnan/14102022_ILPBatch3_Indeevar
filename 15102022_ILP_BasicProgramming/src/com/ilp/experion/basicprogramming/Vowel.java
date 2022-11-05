package com.ilp.experion.basicprogramming;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character :");
		ch = scanner.next().charAt(0);
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' : 
		case 'E' :
		case 'I' : 
		case 'O' : 
		case 'U' : System.out.println("Vowel");
					break;
		  
		default : System.out.println("Is a consonant");
		}
	}

}
