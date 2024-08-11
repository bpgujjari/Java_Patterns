package com.comeback.patterns;

/*
 
  +  
 ++  
+ +  
  +  
  +  
  +  
+++++   
    
   

*/



public class Pattern28{
	public static void main(String[] args) {
		for (int i =1; i<=7; i++) {
			for (int j = 1; j <=5; j++ ) {
				
				if(i==7 || j==3 || (j==4-i)) 
					System.out.print('+');
				else
					System.out.print(' ');	
		}
			
			System.out.println();
		}
	}

}
