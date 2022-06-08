package BasicJavaProgram;

public class AllMethodInMainMethod {

	public static void main(String[] args) {
		AllMethodInUserMethod.show();
		System.out.println("***************");
		AllMethodInUserMethod.div(20,10);
		System.out.println("***************");
		int multi =AllMethodInUserMethod.mul();
		System.out.println("multiplication = " + multi);
		System.out.println("***************");
		double division = AllMethodInUserMethod.divi(20.0, 10.0);
		System.out.println("division by nonstatic is = " + division);
		System.out.println("***************");
		AllMethodInUserMethod aa = new AllMethodInUserMethod();
		aa.show1();
		System.out.println("***************");
		aa.div1(50, 25);
		System.out.println("***************");
		double multi1=aa.mul1();
		System.out.println("Multiplication1 = " + multi1);
		System.out.println("***************");
		double division1=aa.divi1(10.2,20.1); 
		System.out.println("division1 =" + division1);
		System.out.println("***************");
	}

}
