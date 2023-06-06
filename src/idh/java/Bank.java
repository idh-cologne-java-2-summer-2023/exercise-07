package idh.java;

import java.util.Iterator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	private Map<Integer, Account> accMap = new HashMap<Integer, Account>();
	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account(i, random.nextInt(1000));
			accounts[i] = account;
			this.accMap.put(i, accounts[i]);
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}

	public Account getAccount(int number) {
		return this.accMap.get(number);

	}

}
