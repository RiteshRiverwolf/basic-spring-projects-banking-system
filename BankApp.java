package BankingSystem;

public class BankApp {
	private AccountService accountService;

    
    public BankApp(AccountService accountService) {
        this.accountService = accountService;
    }

    public void displayBalance() {
        System.out.println("Account balance: " + accountService.getBalance());
    }

}
