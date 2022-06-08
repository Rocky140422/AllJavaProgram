package Interface;

import java.util.Scanner;

public class InetrfaceProg3Imp implements InterfaceProg3 {
	String name;
	int age;
	String Address;
	int id;

	@Override
	public void getDetails1() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Employee Details");
		name= a.nextLine();
		age = a.nextInt();
		Address = a.next();
		id = a.nextInt();
	
		
	}

	@Override
	public void showDetails1() {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("City = " + city);
		System.out.println("Address = " + Address);
		System.out.println("Id = " + id);
	}
	
}
