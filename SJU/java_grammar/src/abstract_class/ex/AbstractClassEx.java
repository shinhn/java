package abstract_class.ex;

public abstract class AbstractClassEx {
	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		num = i;
		str = s;
	}
	
	public void fun1() {
		System.out.println("fun1()");
	}
	
	// 추상 메서드 선
	public abstract void fun2();
}
