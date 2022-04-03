package mvn_demo;

public class BankAcc 
{
	 int accountId;
	 String accountHolderName;
	 String accountType;
     double accountBalance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() 
	{
		return accountBalance;
	}
	public void setAccountBalance(double updateBalance) {
		this.accountBalance = updateBalance;
	}
public String toString()
{
	return"AccountId="+accountId+",AccountHolderName="+accountHolderName+",AccountType="+accountType+",AccountBalance="+accountBalance;
}
}
