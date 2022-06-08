package LogicalProgram;

import java.util.Arrays;

public class compareArray {

	public static void main(String[] args) {

		int array1[]={10,20,30};
		int array2[]={10,20,30};
		int array3[]={10,20,40};
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		 int array4[][]={{10,20,30},{40,50,60}};
		 int array5[][]={{10,40,30},{40,50,60}};
		 int array6[][]={{10,20,30},{40,50,60}};
		 System.out.println(Arrays.deepEquals(array4, array5));
		 System.out.println(Arrays.deepEquals(array4, array6));
	}

}
