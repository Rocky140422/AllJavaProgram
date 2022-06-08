package Interface;

public class InterfaceProg4Imp implements InterfaceProg4_2 {

	@Override
	public void add() {
		System.out.println("The addition = " + (10+20));
	
		
	}

	@Override
	public void sub() {
		System.out.println("The subtraction = " + (20-10));
		
	}

}
