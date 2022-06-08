package PackageSpecifier1;

public class C {
	public void access3(){
	//	System.out.println("Private Member =" + a);
		System.out.println("Default Member =" + A.b);
		System.out.println("Protected Member =" + A.c);
		System.out.println("Public member =" + A.d);
	}
	public static void main (String[]args){
		C a = new C();
		a.access3();
	}

}
