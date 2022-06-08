package Patterns;

public class StarPattern1 {

	public static void main(String[] args) {

		//*
		//**
		//***

		/*int star=1,space=2;
		for(int row=0;row<3;row++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print("*");
			}
			for(int i=0;i<space;i++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}*/
		int star=3,space=0;
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
			
		}
	}

}

