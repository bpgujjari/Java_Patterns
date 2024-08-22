package com.comeback.patterns;

/*

E
ED
EDC
EDCB
EDCBA

    
*/

public class Pattern60{
	public static void main(String[] args) {
		for (char i ='E'; i>='A'; i--) {
			
			for (char j ='E'; j>=i; j--) {
				System.out.print(j);
			}	
			System.out.println();
			
		}
	}

}
