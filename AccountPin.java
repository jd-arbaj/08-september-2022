package com.testExam.bll;

import java.util.Scanner;

public class AccountPin {
	public static void main(String[] args) {
		int pin= 2841;
		Scanner sc= new Scanner(System.in);
		
		int i=0;
		while(true) {
			System.out.println("Enter pin:");
			int n=sc.nextInt();
			if(n==pin) {
				System.out.println("CORRECT,welcome back.");
				break;
			}
			else {
				if(n<=2) {
				System.out.println("INCORRECT, try again.");
			}
				}
			i++;
			if(i>=3) {
				System.out.println("SORRY but you have been blocked out.");
				break;
			}
			
		}
		
	sc.close();
	}

}