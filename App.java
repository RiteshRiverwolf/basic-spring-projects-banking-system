package BankingSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BankingSystem/config.xml");
        BankApp bankApp = (BankApp) context.getBean("bankApp");

        bankApp.displayBalance(); 
    }
}