package ThisKeywordProgram1;

public class ThisKeywordProg1 {
	public void show(){
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisKeywordProg1 a = new ThisKeywordProg1();
		System.out.println(a);
		a.show();
			ThisKeywordProg1 b = new ThisKeywordProg1();
		System.out.println(b);
		b.show();
		/*ThisKeywordProg1 c = new ThisKeywordProg1();
		System.out.println(c);
		c.show();*/

	}

}
