package com.rebel1;

public class LoopPattern {

	
	
	
	public static void main(String[] args) {
	
		LoopPattern lp = new LoopPattern();
	
		
		
		// Nested loop
		for(int j=1;j<=5;j++)      // rows 
		{
		  
			for(int i=1;i<=j;i++)   //column this loop will start from 1 whenever it evokes again
		{
			System.out.print(i);
			
		}
			System.out.println("");
		}
		
		System.out.println("");
	 
		  lp.loop();
		  System.out.println("");
	}
		
	public void loop()
	{
		for(int k=5;k>=1;k--) 
		{
			for(int l=k;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
	

}


