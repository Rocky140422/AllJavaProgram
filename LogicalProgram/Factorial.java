package LogicalProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int fact = 1;
		for(int i=1;i<=a;i++)//5 4 3 2 1 0
		{
			fact=fact*i;//fact=1*5=5 5*4=20 20*3=60 60*2=120 120*1=120
		}
		System.out.println("factorial of a no. = "+fact);
		//5*4*3*2*1=5!
		

	}

}
