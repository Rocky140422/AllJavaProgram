package LogicalProgram;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = s.nextInt();
		
		System.out.println("Enter first number");
		int b = s.nextInt();
		
		System.out.println("Enter first number");
		int c = s.nextInt();
		
		//By using ternery operator
		
		/*int largest1=a>b?a:b;
		int largset2=c>largest1?c:largest1;
		System.out.println("largest of 3 is: " + largset2);*/
		
		//by using conditional statement
		if(a>b && a>c){
			System.out.println("a is largast no");
		}
		else if(b>a && b>c){
			System.out.println("b is largast no");
		}
		else{
			System.out.println("c is largast no");
		}
		

	}

}
