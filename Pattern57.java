package com.comeback.patterns;
/*

A
BA
CBA
DCBA
EDCBA
    
*/
public class Pattern57{
	public static void main(String[] args) {
		for (char i ='A'; i<='E'; i++) {
			
			for (char j =i; j>='A'; j--) {
				System.out.print(j);
			}	
			System.out.println();
			
		}
	}

}
