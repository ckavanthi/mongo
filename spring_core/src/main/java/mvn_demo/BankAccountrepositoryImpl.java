package mvn_demo;

public class BankAccountrepositoryImpl implements BankAccountRepository 
	
 {
	    
    BankAcc b = new BankAcc();
	
    public double getAccountBalance(long accountId) 
    {
		if(b.getAccountId()==accountId) 
		{
			return b.getAccountBalance();
		}
		else
		{
			return b.getAccountBalance();
		}
		
	}

	public double updateBalance(long accountId, double newBalance) {
		double updateBalance = 100;
		if(b.getAccountId()==accountId) {
			updateBalance = newBalance;
			b.setAccountBalance(newBalance);
			System.out.println("Updated Balance"+getBalance(accountId));
		}
		else {
			updateBalance = newBalance;
			b.setAccountBalance(updateBalance);
		}
		return updateBalance;
	}

	public double getBalance(long accountId) {
		return 0;
	}
		 
	}


