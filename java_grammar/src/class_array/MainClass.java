package class_array;

public class MainClass {
	public static void main(String[] args) {
		// FirstChildClass와 SecondChildClass 모두 ParentClass를 상속하기 때문에 자료형을 ParentClass으로 해도됨
		// FirstChildClass fch = new FirstChildClass();
		ParentClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		// fch와 sch가 같은 자료형이기 때문에 배열로 묶을 수 있음 
		ParentClass[] pArr = new ParentClass[2];
		pArr[0] = fch;
		pArr[1] = sch;
	}
}
