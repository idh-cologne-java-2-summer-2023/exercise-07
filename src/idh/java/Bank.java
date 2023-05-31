package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			Account newAcc = new Account(i, random.nextInt(1000));
			accountMap.put(i, newAcc);
		}
		System.out.println(accountMap);
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(this);
	}
	
	public Account getAccount(int number) {
		return accountMap.get(number);
	}
	
		
	public int size() {
		return accountMap.size();
	}

	

}
