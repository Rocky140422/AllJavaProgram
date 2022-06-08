package LogicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();
		String org_string = str;
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

		if(rev.equals(org_string)){
			System.out.println("String is Palindrome String");
		}
		else
		{
			System.out.println("String is not Palindrome String");
		}
	}

}
