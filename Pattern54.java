package com.comeback.patterns;
/*
 
54321
 4321
  321
   21
    1
    
*/

public class Pattern54{
	public static void main(String[] args) {
		for (int i =5; i>=1; i--) {
			
			for (int j=i;j<5; j++) {
				System.out.print(" ");
			}
			
			for (int j =i; j>=1; j--) {
				System.out.print(j);
			}
			
			
			System.out.println();
			
		}
	}

}
