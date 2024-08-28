package com.comeback.patterns;

/*

*****
****
***
**
*

*/

public class Pattern65{
	public static void main(String[] args) {
		for (char i =5; i>=1; i--) {
			
			for (char j=1; j<=i; j++) {
				System.out.print("*");
			}	
			System.out.println();
			
		}
	}

}
