package bank.main;

import bank.employee.Employee;

public class MainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee("강신현");
		e1.SaveMoney(100);
		e1.Info();
		
		Employee e2 = new Employee("강신현2");
		e2.SaveMoney(200);
		e2.Info();
	}
}
