package interface_;

public class InterfaceClass implements interfaceA, interfaceB {

	@Override
	public void methodB() {
		System.out.println("override methodB");
		
	}

	@Override
	public void methodA() {
		System.out.println("override methodA");
		
	}

}
