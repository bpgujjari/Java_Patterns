package com.comeback.patterns;

/*
 
++++ 
   +
   +
   +  
   +
   +     
   ++++     
   

*/



public class Pattern24{
	public static void main(String[] args) {
		for (int i =1; i<=7; i++) {
			for (int j = 1; j <=7; j++ ) {
				
				if(j==4 || (j<=4&&i==1) || (j>=4 && i==7)) 
					System.out.print('+');
				else
					System.out.print(' ');
			
		}
			
			System.out.println();
		}
	}

}
