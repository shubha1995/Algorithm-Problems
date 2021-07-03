package com.algorithm;

import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.err.println("Enter range for print prime number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Prime Numbers : ");
		
		while (a < b ) {
			int temp = 0;
			for (int i=2; i<=a/2; i++) {
				if (a % i == 0) {
					temp = 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.println(a + " ");
			}
			a++;
		}
				
	}

}
