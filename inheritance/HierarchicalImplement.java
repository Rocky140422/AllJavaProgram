package inheritance;

public class HierarchicalImplement {

	public static void main(String[] args) {
		System.out.println("This is Main Method");
		System.out.println("*****************************");
		System.out.println("This is Child1 Implementation");
		HierarchicalC1 a = new HierarchicalC1();
		a.Father();
		a.Child1();
		System.out.println("*****************************");
		System.out.println("This is Child2 Implementation");
		HierarchicalC2 b = new HierarchicalC2();
		b.Father();
		b.Child2();
		System.out.println("*****************************");
		System.out.println("This is Child3 Implementation");
		HierarchicalC3 c = new HierarchicalC3();
		c.Father();
		c.Child3();

	}

}
