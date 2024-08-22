package com.comeback.patterns;
/*
 
ABCDE
ABCD
ABC
AB
A
    
*/
public class Pattern58{
	public static void main(String[] args) {
		for (char i ='E'; i>='A'; i--) {
			
			for (char j ='A'; j<=i; j++) {
				System.out.print(j);
			}	
			System.out.println();
			
		}
	}

}
