package com.comeback.patterns;

public class Pattern66 {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			
			if (i<=5) {
				for (int j =1; j <=i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
			else {
				for (int j =i; j <10; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
			
		}
	
	}

}
