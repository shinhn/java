package interface2_interface;

public class ToyAirplane implements Toy {

	@Override
	public void walk() {
		System.out.println("The airplane can not walk");	
	}

	@Override
	public void run() {
		System.out.println("The airplane can not run");	
	}
	
}
