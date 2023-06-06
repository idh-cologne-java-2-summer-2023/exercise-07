package idh.java;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	Map<Integer, Account> hmaccount = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));

			// using loop to create
			hmaccount.put(accounts[i].id, accounts[i]);

			//
			hmaccount.entrySet();
			Set<Entry<Integer, Account>> entrySet = hmaccount.entrySet();
			for (Entry<Integer, Account> e : entrySet) {
				System.out.println(e.getKey() + " | " + e.getValue());

			}
		}

	}

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}

	// Implement getAccount(int) to get account off account number
	public Account getAccount(int number) {
		return hmaccount.get(number);
	}

}
