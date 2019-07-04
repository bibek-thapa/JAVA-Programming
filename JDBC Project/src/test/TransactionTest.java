package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.entity.AccountType;
import com.example.entity.Transaction;
import com.example.impl.AccountServiceImpl;
import com.example.impl.TransactionServiceImpl;

class TransactionTest {

	AccountServiceImpl accountService = new AccountServiceImpl();
	@Test
	void testaddTransaction() {
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
	    Transaction transaction = new Transaction();
	    transaction.setAccount(accountService.find(2l));
	    transaction.setAmount(200);
	    transaction.setAccountType(AccountType.CREDIT);
	    assertEquals("SUCCESS",transactionService.add(transaction).toString() );
	    
	}
	
	@Test
	void testRemoveTransaction() 
	{
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
		Transaction transaction1 = transactionService.find(5l);
	    transactionService.remove(transaction1);
	    assertEquals("FAILURE", transactionService.remove(transaction1).toString());
	   
	}
	
	@Test
	void testSearchTransaction() 
	{
		
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
		Transaction transaction = transactionService.find(6l);
		assertEquals(1, transaction.getAccount().getId());    
		   
	}
	
	@Test 
	void testUpdateTransaction() 
	{
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
		Transaction transaction3= transactionService.find(6l);
	    transaction3.setAccount(accountService.find(1l));
	    transaction3.setAccountType(AccountType.DEBIT);
	    transaction3.setAmount(400);
	    
	    assertEquals("SUCCESS",transactionService.update(transaction3).toString());
		
		
	}

}
