package abstract_class.bank;

public class MainClass {
	public static void main(String[] args) {
		Bank myBank = new MyBank("강신현","123-456-789",100);
		
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		myBank.getInfo();
	}
}
