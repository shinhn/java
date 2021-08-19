package bank.employee;

public class Employee {
	String name;
	static int amount=0;
	
	public Employee(String name)
	{
		this.name = name;
	}
	
	public void SaveMoney(int money)
	{
		amount += money;
	}
	
	public void Info()
	{
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}
}
