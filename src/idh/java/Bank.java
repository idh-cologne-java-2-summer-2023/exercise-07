package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {

	private Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < this.accounts.length; i++) {
			Account account = new Account(i, random.nextInt(1000));
			this.accountMap.put(account.getId(), account);
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(this.accounts);
	}

	public Account getAccount(int number) {
		return this.accountMap.get(number);
	}

}
