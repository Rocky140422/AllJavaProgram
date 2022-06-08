package Interface;

public class InterfaceProg2Imp implements Interfaceprog2 {

	@Override
	public void devProj() 
	{
		System.out.println("This is Developer in Project");
	}

	@Override
	public void testProj() 
	{
		System.out.println("This is Tester in Project");
	}

	@Override
	public void manageproj() {
		System.out.println("This is Manager");
		
	}

}
