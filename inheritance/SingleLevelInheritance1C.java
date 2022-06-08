package inheritance;

public class SingleLevelInheritance1C extends SingleLevelInheritance1P{
	public void output(){
		System.out.println("********************************");
		System.out.println("Roll no. of Student is = " + roll_no);
		System.out.println("The name of Student is = " + name );
		System.out.println("Marks obtained = " + marks);
	}

	public static void main(String[] args) {
		SingleLevelInheritance1C a = new SingleLevelInheritance1C();
		a.input();
		a.output();

	}

}
