package com.comeback.patterns;

/*
 
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA

*/



public class Pattern10 {
	public static void main(String[] args) {
		for (char i = 'E'; i>='A'; i--) {
			for (int j = 1; j <=5; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
