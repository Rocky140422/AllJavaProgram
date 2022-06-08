package Exception;

public class Prog4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("We cant divide any no. by zero " + a);
		}
		finally
		{
			System.out.println("This is finally method for divide  by zero ");
		}
		System.out.println("*********************");
		String abc = null;
		try
		{
		System.out.println(abc.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println("cannot perform this action on null " + n);
		}
		finally
		{
			System.out.println("This is finally method for null pointer ");
		}
		System.out.println("Main Method Ended");
		
	

	}

}
