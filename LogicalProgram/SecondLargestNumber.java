package LogicalProgram;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int ar[] = {4,3,2,1,5};
		int largest = 0;
		int secondLargest = 0;
		//int thirdLargest = 0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>largest){
				secondLargest=largest;
				largest=ar[i];
			}
			else if(ar[i]>secondLargest){
				//thirdLargest =secondLargest;
				secondLargest=ar[i];
			}
			
		}
		System.out.println("second Largest Number: " + secondLargest);
		System.out.println("Largest Number: " + largest);
		//System.out.println("third Largest Number: " + thirdLargest);
		
	}
}
