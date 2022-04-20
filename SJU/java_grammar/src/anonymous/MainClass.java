package anonymous;

public class MainClass {
	public static void main(String[] args) {
		//override
		new AnonymousClass() {
			public void method() {
				System.out.println("AnonymousClass's Override method");
			}
		}.method(); // 생성과 동시에 호출 
	}
}
