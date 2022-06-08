 package LogicalProgram;

import java.util.Scanner;

public class ReverseAString {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
	    //String str = "ABCD";
	/*	String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		/*String rev ="" ;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);*/
		String rev = "";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch = str.charAt(i);
			System.out.println(ch);
			rev=rev+ch;
			
		}
		System.out.println("Reverse String = " + rev);
	}

}
