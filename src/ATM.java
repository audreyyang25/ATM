import java.util.HashMap;

public class ATM {
	
	private HashMap <Integer, Double> accounts;
	
	public ATM () {
		accounts = new HashMap <Integer, Double> ();
	}
	
	public void openAccount (Integer accountNum) {
		//if an account with this ID already exists, the openAccount methods overwrite it
		accounts.put (accountNum, 0.0);
	}
	
	public void openAccount (Integer accountNum, Double deposit) {
		accounts.put (accountNum, deposit);
	}
	
	public void closeAccount (Integer accountNum) {
		if (this.checkBalance (accountNum) == 0.0) {
			accounts.remove(accountNum);
		}
	}
	
	public double checkBalance (Integer accountNum) {
		if (accounts.containsKey(accountNum)) {
			return accounts.get(accountNum);
		}
		return 0.0;
	}
	
	public boolean depositMoney (Integer accountNum, Double deposit) {
		if (accounts.containsKey(accountNum)) {
			double value = accounts.get(accountNum) + deposit;
			accounts.replace (accountNum, value);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney (Integer accountNum, Double withdrawal) {
		if (accounts.containsKey(accountNum) && accounts.get(accountNum) != 0.0) {
			double value = accounts.get(accountNum) - withdrawal;
			// I'm making it impossible for someone to withdraw more than they have
			if (value < 0) {
				return false;		
			}
			accounts.replace (accountNum, value);
			return true;
		}
		return false;
	}
}
