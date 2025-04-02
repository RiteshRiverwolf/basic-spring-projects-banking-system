package BankingSystem;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary 
public class SavingsAccount implements AccountService {

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 17000;
	}

}
