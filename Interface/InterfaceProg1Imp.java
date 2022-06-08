package Interface;

import java.util.Scanner;

public class InterfaceProg1Imp implements InterfaceProg1P{
	String name;
	int age;
	double salary;

	@Override
	public void getEmpDetails() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter name, age and salary of Employee");
		name= a.nextLine();
		age = a.nextInt();
		salary = a.nextDouble();
	}

	@Override
	public void setEmpDetails()
	{
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
	}

}
