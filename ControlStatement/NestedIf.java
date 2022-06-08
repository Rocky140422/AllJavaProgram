package ControlStatement;

public class NestedIf {

	public static void main(String[] args) {
		String firstname = "Vishwas";
		String lastname = "Mahajan";
		
		if(firstname == "Vishwas")
		{
			if(lastname=="Mahajan")
			{
				System.out.println("Correct credentials");
			}
			else
			{
				System.out.println("Lastname is Wrong");
			}
		}
		else
		{
			System.out.println("Firstname is Wrong");
		}
		

	}

}
