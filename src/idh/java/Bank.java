package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private HashMap<Integer, Account> accountsMap = new HashMap<>();

	public Bank() {
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account(i, random.nextInt(1000));
			accounts[i] = account;
			accountsMap.putIfAbsent(account.getAccountId(), account);
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}

	public Account getAccount(int number) {
		return accountsMap.get(number);
	}

}
