package Exception;

public class Prog3 {
     //use of multiple catch and using specific exception type in catch
	public static void main(String[] args) {
		String a = null;
		int ar[]= {1,2};
		System.out.println("Main Method Started");
		 
		 
			// Thread.sleep(1000);
		 
		try{
			System.out.println(10/0);
			System.out.println(a.toLowerCase());
			System.out.println(ar[100]);
			
		}
		catch(ArrayIndexOutOfBoundsException abc ){
			System.out.println("Array index out of bounds" + abc);
		}
		catch(NullPointerException def)
		{
			System.out.println("Null Pointer " + def);
		}
		catch(ArithmeticException xyz)
		{
			System.out.println("Arithmetic Exception " + xyz);
		}
		catch(Exception e)
		{
		
			System.out.println("This is generalized exception " + e);
			System.out.println("this is mock practise");
		}
		System.out.println("Main Method Ended");
		/* try
		 {
			 Thread.sleep(1000);
		 }
         finally(Exception z){}*/
	
	}
}
