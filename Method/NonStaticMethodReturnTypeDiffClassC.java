package Method;

public class NonStaticMethodReturnTypeDiffClassC extends NonStaticMethodReturnTypeDiffClassP{

	public static void main(String[] args) {
		NonStaticMethodReturnTypeDiffClassP a = new NonStaticMethodReturnTypeDiffClassP();
		double substraction = a.sub();
		System.out.println("The substraction of two no. is " + substraction);
		

	}

}
