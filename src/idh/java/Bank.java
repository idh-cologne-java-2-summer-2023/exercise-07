package idh.java;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	HashMap<Integer, Account> hash = new HashMap<Integer, Account>();
	
	public void Hash() {
		hash.put(1, accounts[0]);
		hash.put(2, accounts[1]);
		hash.put(3, accounts[2]);
		hash.put(4, accounts[3]);
		hash.put(5, accounts[4]);
		System.out.println(hash);
	}
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	// Works
	public Account getAccount(int number) {
		for (Account account : hash.values()) {
			if (account.getId() == number)
				return account;
		}
		return null;
	}
	
	
	// Doesn't work 
//	public Account getAccount(int number) {
//		for (Entry<Integer, Account> account : hash.entrySet()) {
//			Integer key = account.getKey();
//		    Account value = account.getValue();
//			if (key.equals(number))
//				System.out.println(value);
//				return value;
//		}
//		return null;
//	}
}
