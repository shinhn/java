package superclass;

public class Child extends Parent{
	int num = 10;
	public void Info() {
		System.out.println("child num : " + this.num);
		System.out.println("parent num : " + super.num);
	}
}
