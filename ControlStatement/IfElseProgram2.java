package ControlStatement;

public class IfElseProgram2 {

	public static void main(String[] args) {
		int marks = 100;
		
		if(marks>=40 && marks<=50)
		{
			System.out.println("Student is passed");
		}
		else if(marks>50 && marks<=60)
		{
			System.out.println("Student is passed in Second Class");
		}
		else if(marks>60 && marks<=70)
		{
			System.out.println("Student is passed in First class");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("Student is passed in Distinction");
		}
		else if (marks>90 && marks<=100)
		{
			System.out.println("Student passed in Merit");
		}
		else 
		{
			System.out.println("Invalid Marks");
		}

	}

}
