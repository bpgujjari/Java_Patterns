package com.comeback.patterns;

/*

*
**
***
****
*****

*/

public class Pattern64{
	public static void main(String[] args) {
		for (char i =1; i<=5; i++) {
			
			for (char j=1; j<=i; j++) {
				System.out.print("*");
			}	
			System.out.println();
			
		}
	}

}
