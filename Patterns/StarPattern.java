package Patterns;

public class StarPattern {

	public static void main(String[] args) {
		/*for(int i=0;i<3;i++)
		{
			System.out.print("*");
		}*/
        System.out.println("************");
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**************");	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}
		System.out.println("************");
		for(int i=1;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("************");
		for(int i=0;i<2;i++)
		{
			for(int j=1;j<4;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
			
		
	}

	}


