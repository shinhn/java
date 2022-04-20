package abstract_class.bank;

public abstract class Bank {
	
	String name;
	String account;
	int totalAmount;
	
	public Bank() {
		System.out.println("Bank(abstract class) constructor");
	}
	
	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank(abstract class) constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	} 
	
	// 예금	
	public void deposit() {
		System.out.println("deposit()");
	}
	
	// 출금 
	public void withdraw() {
		System.out.println("withdraw");
	}
	
	// 적금 
	public abstract void installmentSavings();
	
	// 해약 
	public abstract void cancellation(); 
	
	// 정보출력 
	public void getInfo() {
		System.out.println("name : " + name);
		System.out.println("account : " + account);
		System.out.println("totalAmount " + totalAmount);
	}
}
