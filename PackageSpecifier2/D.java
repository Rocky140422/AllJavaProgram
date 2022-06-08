package PackageSpecifier2;

import PackageSpecifier1.A;

public class D extends A{
	public void access4(){
	//	System.out.println("Private Member =" + a);
	//	System.out.println("Default Member =" + b);
		System.out.println("Protected Member =" + c);
		System.out.println("Public member =" + d);
	}
	public static void main (String[]args){
		D a = new D();
		a.access4();
	}

}
