package com.comeback.patterns;

/*
 
   5
   45
  345
 2345
12345

*/



public class Pattern52{
	public static void main(String[] args) {
		
		
		for (int i = 5; i>=1; i--) {
			for (int j =1; j <i; j++) {
				System.out.print(" ");
				
			}
			for (int j =i; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		}
	}
