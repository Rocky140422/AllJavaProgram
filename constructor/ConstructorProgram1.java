package constructor;

public class ConstructorProgram1 {
	int id;
	String name;
	char grade;
	double salary;
	boolean value;
	
	public ConstructorProgram1(){
		id = 121;
		name = "Vishwas";
		grade = 'A';
		salary = 80000.21;
		value = true;
	} 
	public void output()
	{
		System.out.println("Id = " +id);
		System.out.println("Name = " + name);
		System.out.println("Grade = " + grade);
		System.out.println("Salary = " +salary);
		System.out.println("Value =  " + value);
	}
	public static void main (String[]args)
	{
		ConstructorProgram1 x = new ConstructorProgram1();
		x.output();
		
	}
}
