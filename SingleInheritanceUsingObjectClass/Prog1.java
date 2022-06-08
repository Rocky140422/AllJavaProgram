package SingleInheritanceUsingObjectClass;

public  class Prog1 extends Object {
	@Override
	protected void finalize(){
		System.out.println("This is the finalize method from Object  class");
	
	}
	public static void main(String[]args)
	{
		Prog1 a = new Prog1();
		a.finalize();
		}
	

}
