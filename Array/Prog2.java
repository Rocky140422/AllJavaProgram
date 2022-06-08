package Array;

import java.util.Arrays;

public class Prog2 {

	public static void main(String[] args) {
		//int mock_Marks[] = {12,11,17,12,11,19,18};
		//System.out.println(mock_Marks[2]);
	/*	int even =0,odd=0;
		for(int i=0;i<=mock_Marks.length-1;i++){
			if((mock_Marks[i])%2==0){
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);*/
		
		int mock_Marks[] = new int[7];
		mock_Marks[0]= 12;
		mock_Marks[1]= 11;
		mock_Marks[2]= 17;
		mock_Marks[3]= 12;
		mock_Marks[4]= 11;
		mock_Marks[5]= 19;
		mock_Marks[6]= 18;
		
		System.out.println("6th element is = " + mock_Marks[5]);
		
		//for printing all element
		for(int i=0;i<=6;i++)
		{
			System.out.println(mock_Marks[i]);
		}
		//to measure length of array
	//	int length = mock_Marks.length;
	//	System.out.println("length of array = " + length);
		
		System.out.println("Length of Array = " + mock_Marks.length);
		
		//Printing all element using length of array
		
		for(int i=0;i<mock_Marks.length;i++)
		{
			System.out.println(mock_Marks[i]);
		}
		System.out.println("***************");
		Arrays.sort(mock_Marks);
		for(int i=0;i<mock_Marks.length;i++)
		{
			System.out.println(mock_Marks[i]);
		}
		System.out.println("******************");
		for(int j=mock_Marks.length-1;j>=0;j--)
		{
			System.out.println(mock_Marks[j]);
		}
		
		
		
		
		
		
		

	}

}
