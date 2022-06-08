package ThisKeywordProgram1;

public class ThisSuperC extends ThisSuperProgP {
	int a=20;
	public void show2(int a)
	{
		System.out.println("A = " + super.a);
		System.out.println("A = " + this.a);
		System.out.println("A = " + a);
	}

}
