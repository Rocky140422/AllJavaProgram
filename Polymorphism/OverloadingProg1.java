package Polymorphism;

public class OverloadingProg1 {
	public void show()
	{
		System.out.println("Polymorphism Program");
	}
	public void Show(int a)
	{
		System.out.println("A =" + a );
	}
	public void show(int a,int b)
	{
		System.out.println("Value of A and B are " + a + " & " + b);
	}
	public void show(double x,int b)
	{
		System.out.println("values are " + x + " & "  + b);
	}
	public void show(String s, float f)
	{
		System.out.println("String = " + s + " float = " + f);
	}
	public void show(int e,int f, int g)
	{
		System.out.println(e + f + g);
	}

	public static void main(String[] args) {
		OverloadingProg1 aa = new OverloadingProg1();
		aa.show();
		aa.Show(10);
		aa.show(20.5, 50);
		aa.show(99, 100);
		aa.show("Vishwas", 10.2f);
		aa.show(5, 4, 2);
		
	

	}

}
