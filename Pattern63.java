package com.comeback.patterns;

/*

EDCBA
DCBA
CBA
BA
A

*/

public class Pattern63{
	public static void main(String[] args) {
		for (char i ='E'; i>='A'; i--) {
			
			for (char j=i; j>='A'; j--) {
				System.out.print(j);
			}	
			System.out.println();
			
		}
	}

}
