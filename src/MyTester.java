
public class MyTester {
	public static void main(String[] args) {
		ATM machine = new ATM ();
		machine.openAccount (1);
		machine.openAccount (2, 450.0);
		System.out.println (machine.checkBalance (2));
		machine.depositMoney(1, 200.0);
		System.out.println (machine.checkBalance(1));
		System.out.println (machine.withdrawMoney(2, 450.0));
		System.out.println (machine.checkBalance(2));
		machine.closeAccount(2);
		System.out.println (machine.checkBalance(2));
		machine.depositMoney(1, 200.0);
		System.out.println (machine.checkBalance(1));
	}
	
}