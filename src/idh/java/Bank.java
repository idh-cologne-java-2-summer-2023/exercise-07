package idh.java;


import java.util.Iterator;
import java.util.HashMap;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

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
	
	public Account getAccount(int number) {
		// TODO: Implement
		HashMap<Integer, Account> accountsMap = new HashMap<Integer, Account>();
		int i;
		for(i = 0; i < this.accounts.length; i++) {
			accountsMap.put(this.accounts[i].id, this.accounts[i]);
		}
		return accountsMap.get(number);
	}

}
