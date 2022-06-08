package Polymorphism;

public class OverridingProg3Implement {

	public static void main(String[] args) {
		OverridingProg3P x = new OverridingProg3P();
		x.property();
		x.marriageOfChild();
		System.out.println("***********************");
		OverridingProg3C a = new OverridingProg3C();
		a.property();
		a.marriageOfChild();
		System.out.println("**************************");
	    OverridingProg3P c = new OverridingProg3C();// for MCQ que we can create object like this.
		c.property();
		c.marriageOfChild();
		

	}

}
