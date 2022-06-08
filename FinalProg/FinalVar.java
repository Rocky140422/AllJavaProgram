package FinalProg;

public class FinalVar {
	/*final*/ int door = 10;
	public void Home()
	{
		 door=100; //Error:The final field FinalVar.door cannot be assigned
		System.out.println("no. of doors in home = " + door);
	}
		public static void main(String[] args) {
		FinalVar a = new FinalVar();
		a.Home();
		}
		
}
