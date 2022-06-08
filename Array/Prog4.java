package Array;

public class Prog4 {

	public static void main(String[] args) {
		String name[][] = new String[2][2]; //Multi dimentional Array
		name[0][0] = "Java";
		name[0][1] = "Python";
		name[1][0] = ".net";
		name[1][1] = "Ruby";
		
	/*	for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(name[i][j]);
			}
		}*/
		System.out.println("Print all elements in matrix form");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(name[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
