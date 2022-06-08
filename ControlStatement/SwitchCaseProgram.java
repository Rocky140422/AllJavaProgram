package ControlStatement;

public class SwitchCaseProgram {

	static public void main(String[] args) {
		String days = "Tuesday";
		
		switch(days)
		{
		case("Monday"):
		    System.out.println("Today is Monday");
		break;
		case("Tuesday"):
			System.out.println("Today is Tuesday");
		break;
		case("Wednesday"):
			System.out.println("Today id Wednesday");
		break;
		case("Thursday"):
			System.out.println("Today is Thursday");
		break;
		case("Friday"):
			System.out.println("Today is Friday");
		break;
		default:
			System.out.println("Today is Weekend");
		}
		
		
		
		

	}

}
