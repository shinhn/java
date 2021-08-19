package object;

public class MainClass {
	public static void main(String[] args) {
		// class로 object(객체) 생성 
		Grandeur car1 = new Grandeur();
		car1.color = "red";
		car1.gear = "auto";
		car1.price = 30;
		
		car1.run();
		car1.stop();
		car1.info();
		
		System.out.println();
		
		Grandeur car2 = new Grandeur("blue", 25);
		
		car2.run();
		car2.stop();
		car2.info();
		
		System.out.println();
		
		car2.info("green", "auto", 40);
		
		System.out.println();
		
		car2.info2("black", "manual", 35);
		
		
		
		/*
		Bicycle B1 = new Bicycle();
		B1.color = "black";
		B1.price = 5;
		
		B1.info();
		
		System.out.println();
		
		Bicycle B2 = new Bicycle("red", 4);
		B2.info();
		*/
	}
}
