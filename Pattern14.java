package com.comeback.patterns;

/*
 
11111
12345
33333
12345
55555

*/



public class Pattern14{
	public static void main(String[] args) {
		for (int i =1; i<=5; i++) {
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
