package com.comeback.patterns;

/*
 
+++++++
     + 
    +  
   +   
  +    
 +     
+   

THALA FOR A REASON
   

*/



public class Pattern35{
	public static void main(String[] args) {
		for (int i =1; i<=7; i++) {
			for (int j = 1; j <=7; j++ ) {
				
				if(i==1 || j==8-i) 
					System.out.print('+');
				else
					System.out.print(' ');	
		}
			
			System.out.println();
		}
	}

}
