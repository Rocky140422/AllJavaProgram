package Method;

public class NonStaticMethodSameClass {
	public void display()
	{
		System.out.println("This is display non static method");
	}

	public static void main(String[] args) {
		NonStaticMethodSameClass a = new NonStaticMethodSameClass();
		a.display();
	

	}

}
