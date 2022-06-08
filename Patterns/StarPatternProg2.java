package Patterns;

public class StarPatternProg2 {

	public static void main(String[] args) {
	//	int row=2,number=3;
	/*	for(int row=0;row<2;row++)
		{
			for(int number=1;number<4;number++)
			{
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}*/
		//*
		//**
		//***
	/*	int star=1,space=2;
		for(int row=0;row<3;row++)
		{
		    for(int i=0;i<star;i++)
		    {
		    	System.out.print("*");
		    }
		    for(int j=0;j<space;j++)
		    {
		    	System.out.print(" ");
		    }
		    System.out.println();
		    star++;
		    space--;
		}*/
		//   *
		//  ***
		// *****
		//*******
	/*	int space=3,star=1;
		for(int row=1;row<=4;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}*/
		//   *
		//  **
		// ***
		//****
	/*	int space=3,star=1;
		for(int row=1;row<=4;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
			
		}*/
		//****
		//***
		//**
		//*
	/*	int	space=0,star=4;
		 for(int row=1;row<=4;row++)
		 {
		 for(int i=1;i<=space;i++)
		 {
		 System.out.print("");
		 }
		 for(int j=1;j<=star;j++)
		 {
		 System.out.print("*");
		 }
		 System.out.println();
		 space++;
		 star--;
		 }*/
		//***
		//**
		//*
		//**
		//***
	/*	int star=3,space=0;
		for(int row=1;row<=5;row++)
		{
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
			if(row<=2)
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
			}
			
		}*/
		//   *
		//  ***
		// *****
		//  ***
		//   *
		int space=2,star=1;            //1  3
		for(int row=1;row<=5;row++)
		{
			for(int i=1;i<=space;i++)//i=1   1<=0
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)//j=1    1<=5
			{
				System.out.print("*");
			}
			System.out.println();           //  *
			if(row<=2)                      // ***
			{                               //*****
				space--;                    // 
				star=star+2;
			}
			else
			{
			space++;
		    star=star-2;
			}
			
		}
	}
}
		
		
	
