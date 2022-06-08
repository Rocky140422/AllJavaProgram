package Exception;

public class Prog1 {

	public static void main(String[] args) {
	System.out.println("Main Method Started");
		int a=10;
		int b=0;
		int c=0;
		
		try{
			System.out.println("Try block Started");
			c=a/b; //Unchecked Exception
			System.out.println("Try block Ended");
		}
		catch(Exception a1)
		{
			System.out.println("This is arithmetic exception and we have handle it " + a1);
		}
	    System.out.println("Division = " + c);
	    System.out.println("Main Method Finished");
	    
		try
		{
	    Thread.sleep(2000);//Checked Exception, it halt program execution for 2 secs
		}
		catch(Exception e)
		{
			System.out.println("This is checked Exception" + e);
		}
		
		

	}

}
