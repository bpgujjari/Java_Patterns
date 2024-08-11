package com.comeback.patterns;

/*
 
55555
44444
33333
22222
11111

*/



public class Pattern05 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
