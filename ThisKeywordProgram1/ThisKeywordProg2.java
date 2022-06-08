package ThisKeywordProgram1;

public class ThisKeywordProg2 {
	int num = 100;//instance variable
	public ThisKeywordProg2(int num){ // local variable
     num = this.num;
		System.out.println("Number = " + num);
		
	}
	public void show(int num){
		//num=this.num;
		System.out.println("number =" + num);
	}

	public static void main(String[] args) {
		ThisKeywordProg2 a = new ThisKeywordProg2(200);
		
		a.show(300);
	}

}
