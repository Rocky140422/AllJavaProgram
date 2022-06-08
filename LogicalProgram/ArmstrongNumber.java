package LogicalProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=370;// 3 7 1 27+343+1=371 371/10=37 1
		int rem,sum=0;
		int num1=num;
		while(num1>0)
		{
			rem=num1%10;//0 7 3
			sum=sum+rem*rem*rem; //sum=0+0*0*0=0 1+7*7*7=343+1=344 344+3*3*3=371
			num1=num1/10;//37 3 
		}
		System.out.println(sum);//371
		if(num==sum)
		{
			System.out.println("Number is Armstrong no.");
		}
		else
		{
			System.out.println("Number is not Armstrong Number");
		}
		
		int no=370;
		int rem1,sum1=0;
		int num2=no;
		while(num2>0)
		{
			rem1=num2%10;
			sum1=sum1+rem1*rem1*rem1;
			num2=num2/10;
		}
		System.out.println(sum1);

		if(no==sum1)
		{
			System.out.println("No. is Armstrong no.");
		}
		else
		{
            System.out.println("No. is not  Armstrong no.");
		}
	}

}
