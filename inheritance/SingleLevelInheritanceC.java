package inheritance;

public class SingleLevelInheritanceC extends SingleLevelInheritanceP {
	public void Bike()
	{
		System.out.println("Child have Bike");
	}
	
	public void Mobile(){
		System.out.println("Child have Mobile");
	}

	public static void main(String[] args) {
		SingleLevelInheritanceC a = new SingleLevelInheritanceC();
		a.Home();
		a.Car();
		a.Money();
		
		a.Bike();
		a.Mobile();
		

	}

}
