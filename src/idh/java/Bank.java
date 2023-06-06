package idh.java;


import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	private Map<Integer, Account> accountMap = new HashMap<>();
    


	public Bank() {
		
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			
            
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		
		return accountMap.get(number);
	}

}
