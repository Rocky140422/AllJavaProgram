package LogicalProgram;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = s.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org_num==rev){
			System.out.println("Num is palindrome num");
		}
		else
		{
			System.out.println("Num is not palindrome num");
		}
	}

}
