
public class ATMTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM machine = new ATM ();
		machine.openAccount(1);
		machine.openAccount(2, 450.0);
		System.out.println (machine.checkBalance(2));
		machine.depositMoney(1, 200.0);
		System.out.println (machine.checkBalance(1));
		System.out.println (machine.withdrawMoney(2, 450.0));
		System.out.println (machine.checkBalance(2));
//		machine.openAccount(2, 300.0);
//		System.out.println (machine.checkBalance(2));
		machine.closeAccount(2);
		System.out.println (machine.checkBalance(2));
		machine.depositMoney(1, 200.0);
		System.out.println (machine.checkBalance(1));
		
	}

}
