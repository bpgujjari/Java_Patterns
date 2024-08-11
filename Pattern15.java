package com.comeback.patterns;

/*
 
55555
12345
33333
12345
11111

*/



public class Pattern15{
	public static void main(String[] args) {
		for (int i =5; i>=1; i--) {
			for (int j = 1; j <=5; j++ ) {
				if(i%2==0)
				System.out.print(j);
				
				else
					System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
