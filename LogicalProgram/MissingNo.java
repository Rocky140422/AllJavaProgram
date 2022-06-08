package LogicalProgram;

public class MissingNo {

	public static void main(String[] args) {
		int ar[]={1,2,3,4,6,7,8,9,10};
		int sum1=0;
		for(int i=0;i<ar.length;i++){
			sum1=sum1+ar[i];
		}
		//System.out.println("sum of elements in array = "+sum1);
		
		int sum2=0;
		for(int j=1;j<=10;j++){
			sum2=sum2+j;
		}
		//System.out.println("sum of elements 1 to 9 = "+ sum2);
		System.out.println("Missing number in array is: " + (sum2-sum1));
	}
}
