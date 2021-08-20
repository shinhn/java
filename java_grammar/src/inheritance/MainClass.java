package inheritance;

public class MainClass {
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.ParentFun(); // 상속 받은 부모 클래스의 메서드 호출 가능 
		c.ChildFun();
		
		
	}
}
