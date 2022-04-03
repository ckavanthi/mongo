package mvn_demo;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountController {
	@Autowired
	private BankAccountServiceImpl serimpl;
	BankAcc c = new BankAcc();
	
public double withdraw(long accountId, double balance) {
		
		serimpl.withdraw(accountId, balance);
		return accountId;
	}
	
	public double deposit(long accountId, double balance) {
		
		serimpl.deposit(accountId, balance);
		return accountId;
	}
	
	public double getBalance(long accountId) {
		
		serimpl.getBalance(accountId);
		return accountId;
	}
	
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
		serimpl.fundTransfer(fromAccount, toAccount, amont);
		return false;
	}


}
