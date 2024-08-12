package com.comeback.patterns;

/*
 
12345
6789
123
45
6

*/



public class Pattern51{
	public static void main(String[] args) {
		for (int i =1; i<=5; i++) {
			for (int j=5;j>=i;j--) {
				
					if(i<=j) 
						System.out.print(j);
					
					else
						System.out.print(' ');
			}
			
			System.out.println();
		}
	}

}
