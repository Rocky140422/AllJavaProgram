package constructor;

public class ConstructorProgram2 {
	int a;
	int b;
	public ConstructorProgram2()
	{
		a=10;
	}
	public ConstructorProgram2(int c)
	{
		b=c;
	}
	public ConstructorProgram2(int d, int e)
	{
		a=d;
		b=e;
	}
	
	public void show()
	{
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

	public static void main(String[] args) {
		ConstructorProgram2 x = new ConstructorProgram2();
		x.show();
		System.out.println("***************");
		ConstructorProgram2 y = new ConstructorProgram2(20);
		y.show();
		System.out.println("***************");
		ConstructorProgram2 z = new ConstructorProgram2(30,40);
		z.show();

	}

}
