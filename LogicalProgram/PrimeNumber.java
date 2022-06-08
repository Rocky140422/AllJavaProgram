package LogicalProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=213;//8%2=0
		int count =0;
		for(int i=2;i<num;i++)//2
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count>0)
		{
			System.out.println("No. is not Prime");
		}
		else
		{
			System.out.println("No. is  Prime");
		}

	}

}
