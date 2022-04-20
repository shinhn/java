package abstract_class.ex;

public class ClassEx extends AbstractClassEx {
	public ClassEx(){
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s){
		super(i,s); // 상위 클래스(AbstractClassEx)로 (i,s) 전달 
	}
	
	// 추상 메서드 구현 
	@Override
	public void fun2() {
		System.out.println("fun2()");
	}
}
