package com.comeback.patterns;

/*
 
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE


*/



public class Pattern09 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for ( char j = 'A'; j<='E'; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
