package Method;

public class NonStaticMethodWtihParaSameClass {
	public void sub(double x,double y)
	{
		double substraction = x-y;
		System.out.println("Substraction of two no. is = " + substraction );
	}

	public static void main(String[] args) {
		NonStaticMethodWtihParaSameClass a = new NonStaticMethodWtihParaSameClass();
		a.sub(10.2, 5.1);
	}

}
