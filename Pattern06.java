package com.comeback.patterns;

/*
 
10101
10101
10101
10101
10101

*/



public class Pattern06 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j<=5; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
