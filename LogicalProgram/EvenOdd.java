package LogicalProgram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter a no. = ");
	int num = s.nextInt();
	
		
	if(num%2==0)
	{
		System.out.println("Entered no. is even");
	}
	else
	{
		System.out.println("Entered no. is odd");
	}
}
}