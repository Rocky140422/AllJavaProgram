package PackageSpecifier1;

public class B extends A {
	public void access2(){
	//	System.out.println("Private Member =" + a);
		System.out.println("Default Member =" + b);
		System.out.println("Protected Member =" + c);
		System.out.println("Public member =" + d);
	}
	public static void main (String[]args){
		B a = new B();
		a.access2();
	}

}
