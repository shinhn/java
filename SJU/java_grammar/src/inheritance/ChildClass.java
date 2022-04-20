package inheritance;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	public void ChildFun() {
		System.out.println("--ChildFun--");
	}
	public void ParentFun() {
		System.out.println("--override ParentFun--");
	}
}
