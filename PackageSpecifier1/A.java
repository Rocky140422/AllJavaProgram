package PackageSpecifier1;

public class A {
	private int a;   //private data member
	static int b;           //Default data member
	protected static int c; //protected data member
	public static int d;    //public data member
	
	public void access1(){
		System.out.println("Private Member =" + a);
		System.out.println("Default Member =" + b);
		System.out.println("Protected Member =" + c);
		System.out.println("Public member =" + d);
	}
	public static void main (String[]args){
		A a = new A();
		a.access1();
	}
}
