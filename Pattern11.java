package com.comeback.patterns;

/*
 
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA

*/



public class Pattern11 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++ ) {
			for (char j = 'E'; j>='A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
