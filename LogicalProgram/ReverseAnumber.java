package LogicalProgram;

import java.util.Scanner;

public class ReverseAnumber {
	public static void sample()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no. = ");
		int num = s.nextInt();
		StringBuffer s1 = new StringBuffer(String.valueOf(num));
		StringBuffer rev = s1.reverse();
		System.out.println(rev);
		System.out.println("***********************");
		int rev1=0;
		while(num!=0){//54321 5432 543 54 5 0(break)
			rev1=rev1*10+num%10;//1 1*10+2=12 12*10+3=123 123*10+4=1234 1234*10+5=12345
			num=num/10;//5432 543 54 5 0
		}
		System.out.println(rev1);
	}
	//1234 123 12 1
	//0*10+4=4 4*10+3=43 43*10+2=432 432*10+1=4321
	//1234/10=123 123/10=12 12/10=1 1/10=0
	public static void main(String []args)
	{
		int num=12345;//
		int revNum=0,temp;
		int mulFactor=10000;
		for(int i=0;i<5;i++)
		{
			temp=num%10;
			revNum=revNum+temp*mulFactor;
			num=num/10;
			mulFactor=mulFactor/10;
		}
		System.out.println(revNum);
		sample();
	}

}
