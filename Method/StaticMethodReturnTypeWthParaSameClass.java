package Method;

public class StaticMethodReturnTypeWthParaSameClass {
	public static int add(int num1,int num2)
	{
		return num1+num2;
	}

	public static void main(String[] args) {
		int addition = add(25,25);
		System.out.println("The addition of two no. is = " + addition);
		

	}

}
