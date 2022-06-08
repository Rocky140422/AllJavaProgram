package ThisKeywordProgram1;

public class ThisKeywordProg3 {
	public ThisKeywordProg3(){
	 this(100);
		System.out.println("This is default constructor");
		
	}
	public ThisKeywordProg3(int a)
	{
	//	this();
		System.out.println("A = "+ a);
	}

	public static void main(String[] args) {
		ThisKeywordProg3 a = new ThisKeywordProg3();
	}

}
