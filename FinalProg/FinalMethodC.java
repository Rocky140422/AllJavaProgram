package FinalProg;

public class FinalMethodC extends FinalMethodP{
	public void harry() // Error: Cannot override the final method from FinalMethodP
	{
		System.out.println("This is display method of child class");
	}
	public static void main(String[] args) {
		FinalMethodC a = new FinalMethodC();
		a.harry();
		}

} 
