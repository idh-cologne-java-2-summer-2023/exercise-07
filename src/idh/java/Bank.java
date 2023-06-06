package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
//	Account[] accounts = new Account[5];
	private HashMap<Integer, Account> accounts;

	public Bank() {
		accounts = new HashMap<>();
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			Account account = new Account(i, random.nextInt(1000));
			accounts.put(i,  account);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	public Account getAccount(int number) {
		return accounts.get(number);
	}

}
