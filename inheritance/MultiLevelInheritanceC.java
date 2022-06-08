package inheritance;

public class MultiLevelInheritanceC extends MultiLevelInheritanceP{
	public void Bike(){
		System.out.println("***************");
		System.out.println("Child have Bike");
	}
	public void Iphone(){
		System.out.println("Child have Iphone");
		System.out.println("*****************");
	}

	public static void main(String[] args) {
		MultiLevelInheritanceC x = new MultiLevelInheritanceC();
		x.Home();
		x.Land();
		
		x.Money();
		x.Car();
		
		x.Bike();
		x.Iphone();

	}

}
