package object;

//public vs private
//public : class 외부에서 호출가능
//private : class 내부에서만 사용가능 

//<클래스> 
//일반적으로 첫글자는 대문자 
public class Grandeur {

	// <멤버 변수> (속성)
	public String color;
	public String gear;
	public int price;

	// <생성자>
	// 클래스 이름과 동일하며 반환값은 없다.
	// 생성을 할 때 필요한 내용들을 기술한다. 
	public Grandeur() {
		System.out.println("Granduer constructor");
	}
	
	// MainClass에서 어떤 매개변수로 class를 생성하는지에 따라 생성자를 여려개를 생성하여 사용할 수 있음
	public Grandeur(String c, int p) {
		System.out.println("Granduer constructor");
		color = c;
		price = p;
	}

	// <메서드> (기능)
	public void run() {
		System.out.println("--run()--");
	}

	public void stop() {
		System.out.println("--stop()--");
	}
	
	public void info() {
		System.out.println("--info()--");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
	
	// 중복 메서드
	// : 메서드의 이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드 
	public void info(String c, String g, int p) {
		color = c;
		gear = g;
		price = p;
		
		System.out.println("--info()--");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
	
	public void info2(String c, String g, int p) {
		color = c;
		gear = g;
		price = p;
		
		System.out.println("--info2()--");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
