package mvn_demo;

import org.springframework.stereotype.Component;

@Component
public interface BankAccountRepository
{
	public double updateBalance(long accountId, double newBalance);
	double getAccountBalance(long accountId);
}
