package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private HashMap<Integer, Account> accountMap;

	public Bank() {
		// create accounts with varying balances
		accountMap = new HashMap<>();
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account(i, random.nextInt(1000));
			accountMap.put(account.getId(), account);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accountMap.values().iterator();
	}
	
	public Account getAccount(int number) {
		return accountMap.get(number);

	}

}
