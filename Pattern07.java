package com.comeback.patterns;

/*
 
11111
00000
11111
00000
11111


*/



public class Pattern07 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j<=5; j++) {
				System.out.print(i%2);
			}
			System.out.println();
		}
	}

}
