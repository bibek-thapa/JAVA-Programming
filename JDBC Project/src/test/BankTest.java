package test;

import com.example.entity.Account;
import com.example.entity.AccountType;
import com.example.entity.Bank;
import com.example.entity.Patron;
import com.example.entity.Transaction;
import com.example.impl.AccountServiceImpl;
import com.example.impl.BankServiceImpl;
import com.example.impl.PatronServiceImpl;
import com.example.impl.TransactionServiceImpl;

public class BankTest {

	public static void main(String[] args) {
	
	/*
	 * 
	 * Patron CRUD OPERATION
	 * 
	 * 
	 * */	
		
		
		PatronServiceImpl patronService = new PatronServiceImpl();
		Patron patron = new Patron();
		patron.setName("Hari");
		patron.setImage(new byte[] {'a'});
		patronService.add(patron);
		
		patronService.remove(patron);
		
		Patron patron1 = patronService.find(30l);
		patron1.setName("Manish");
		patron1.setImage(new byte[] {'a'});
		patronService.update(patron1);
		
		/*Finding the patron by the id*/
		patronService.find(30l);
	
		/*Finding all the patrons by the name*/
		patronService.find("Manish");
		
		/*
		 * Bank CRUD OPERATION
		 * 
		 * */
		BankServiceImpl bankService = new BankServiceImpl();
		Bank bank = new Bank();
		bank.setName("fifththird");
		bankService.add(bank);
		bankService.remove(bank);
		
		Bank bank1 = bankService.find(14l);
		bank1.setName("Updated bank");
		bankService.update(bank1);
		
		bankService.find(3l);
	    bankService.find("chase-frisco");
	    
	    
	    /* Account CRUD Operation*/
	    
	    AccountServiceImpl accountService = new AccountServiceImpl();
	    Account account = new Account();
	    account.setBank(bankService.find(3l));
	    account.setPatron(patronService.find(30l));
	    accountService.add(account);
	    
	    accountService.find(3l);
		
	    Account account1 = accountService.find(9l);
	    accountService.remove(account1);
	    
	    Account account2 = accountService.find(8l);
	    account2.setBank(bankService.find(2l));
	    account2.setPatron(patronService.find(1l));
	    accountService.update(account2);
	    
	    
	    /*Transaction CRUD OPERATION*/
	    TransactionServiceImpl transactionService = new TransactionServiceImpl();
	    Transaction transaction = new Transaction();
	    transaction.setAccount(accountService.find(2l));
	    transaction.setAmount(200);
	    transaction.setAccountType(AccountType.CREDIT);
	    transactionService.add(transaction);
	    
	    Transaction transaction1 = transactionService.find(5l);
	    transactionService.remove(transaction1);
	    
	    transactionService.find(4l);
	    
	   Transaction transaction3= transactionService.find(6l);
	    transaction3.setAccount(accountService.find(1l));
	    transaction3.setAccountType(AccountType.DEBIT);
	    transaction3.setAmount(400);
	    
	    transactionService.update(transaction3);

	}

}
