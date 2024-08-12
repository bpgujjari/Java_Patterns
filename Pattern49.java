package com.comeback.patterns;

/*
 
12345
6789
123
45
6

*/



public class Pattern49{
	public static void main(String[] args) {
		int k=1;
		for (int i =5; i>=1; i--) {
			for (int j=1;j<=i;j++) {
				
				if(k>9)
					k=1;
				
					System.out.print(k);
				k++;
			}
			
			System.out.println();
		}
	}

}
