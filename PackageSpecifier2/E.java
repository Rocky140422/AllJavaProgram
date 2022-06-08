package PackageSpecifier2;

import PackageSpecifier1.A;



public class E {
	public void access5(){
	//	System.out.println("Private Member =" + a);
	//	System.out.println("Default Member =" + b);
	//	System.out.println("Protected Member =" + A.c);
		System.out.println("Public member =" + A.d);
	}
	public static void main (String[]args){
		E a = new E();
		a.access5();
	}

}
