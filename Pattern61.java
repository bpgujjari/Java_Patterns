package com.comeback.patterns;

/*

E
DE
CDE
BCDE
ABCDE

    
*/

public class Pattern61{
	public static void main(String[] args) {
		for (char i ='E'; i>='A'; i--) {
			
			for (char j =i; j<='E'; j++) {
				System.out.print(j);
			}	
			System.out.println();
			
		}
	}

}
