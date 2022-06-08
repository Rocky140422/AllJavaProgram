package ControlStatement;

public class IfElseProgram {

	public static void main(String[] args) {
		String rating = "";
		if(rating =="*")
		{
			System.out.println("Worst Rating");
		}
		else if(rating == "**")
		{
			System.out.println("Bad Rating");
		}
		else if (rating == "***")
		{
			System.out.println("Avg Rating");
		}
		else if(rating =="****")
		{
			System.out.println("Good Ratnig");
		}
		else if(rating =="*****")
		{
			System.out.println("Best Rating");
		}
		else
		{
			System.out.println("No Feedback");
		}

	}

}
