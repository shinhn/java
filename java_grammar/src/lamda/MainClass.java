package lamda;

public class MainClass {
	public static void main(String[] args) {
		// 매개변수와 실행문만으로 작성 (접근자, 반환형, return 키워드 생성) 
		LamdaInterface I1 = (String s1, String s2, String s3) -> {System.out.println(s1 + " " + s2 + " " + s3);};
		I1.method("hello", "java", "world");
		
		// 매개변수가 1개이거나 타입이 같을 때, 타입을 생략할 수 있다.
		LamdaInterface2 I2 = (s) -> {System.out.println(s);};
		I2.method("hello");
		
		// 실행문이 1개일 때, '{ }'을 생략할 수 있다.
		LamdaInterface2 I3 = (s) -> System.out.println(s);
		I3.method("hello");
		
		// 매개변수와 실행문이 1개일 때, '( )' 와 '{ }'을 모두 생략할 수 있다.
		LamdaInterface2 I4 = s -> System.out.println(s);
		I4.method("hello");
		
		// 매개변수가 없을때, '( )'만 작성한다.
		LamdaInterface3 I5 = () -> System.out.println("no parameter");
		I5.method();
		
		// 반환값이 있는 경우 
		LamdaInterface4 I6 = (x,y)->{
			int result = x + y;
			return result;
		};
		System.out.printf("I6.method(10,20) : %d\n", I6.method(10, 20));
		
	}
}
