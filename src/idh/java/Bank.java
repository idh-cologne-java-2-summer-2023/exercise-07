package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	private Map<Integer, Account> accountMap = new HashMap<>();
	private Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			accountMap.put(i, accounts[i]);
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