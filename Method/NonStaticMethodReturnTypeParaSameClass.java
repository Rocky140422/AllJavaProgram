package Method;

public class NonStaticMethodReturnTypeParaSameClass {
	public int add()
	{
		return 25+25;
	}

	public static void main(String[] args) {
		
		NonStaticMethodReturnTypeParaSameClass z= new NonStaticMethodReturnTypeParaSameClass();
		int addition= z.add();
		System.out.println("The addition of two no. = " + addition);

	}

}
