package interface2_interface;

public class ToyRobot implements Toy {

	@Override
	public void walk() {
		System.out.println("The toyrobot can walk");	
	}

	@Override
	public void run() {
		System.out.println("The toyrobot can run");	
	}
	
}
