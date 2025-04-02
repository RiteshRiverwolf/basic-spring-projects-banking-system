package BankingSystem;
import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements AccountService{

	@Override
	public double getBalance() { 
		// TODO Auto-generated method stub
		return 6000;
	}

}
