package LogicalProgram;

import java.util.Scanner;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = s.nextInt();
		int even=0,odd=0,rem;
		while(num>0){
			rem=num%10;
			if(rem%2==0){
				even++;
			}
			else{
				odd++;
			}
			num=num/10;
		}
		System.out.println("Even Didgits in number are = "+even);
		System.out.println("Odd Didgits in number are = "+odd);

	}

}
