package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	// Account[] accounts = new Account[5];
	
	Map<Integer, Account> kvAccounts = new HashMap<Integer, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			kvAccounts.put(i, new Account(i, random.nextInt(1000)));
		}
		
//		for (int i = 0; i < accounts.length; i++) {
//			accounts[i] = new Account(i, random.nextInt(1000));
//		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(this);
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		for (Account a : kvAccounts.values()) {
			if (a.id == number)
				return a;
		}
		return null;
	}

}
