package ThisKeywordProgram1;

public class ThisKeywordProg4 {
	public ThisKeywordProg4(){
	//	this(100);
		System.out.println("This is default constructor");
		
	}
	public ThisKeywordProg4(int a)
	{
	this();
		System.out.println("A = "+ a);
	}

	public static void main(String[] args) {
		ThisKeywordProg4 a = new ThisKeywordProg4(200);
				
				

	}

}
