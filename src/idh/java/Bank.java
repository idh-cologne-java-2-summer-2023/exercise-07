package idh.java;


import java.util.Iterator;
import java.util.HashMap;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			accounts.put[i] = new Account(i, random.nextInt(1000));
		}
	}
	
	@Override
	HashMap<Integer, Account> accounts = new HashMap<>();
	
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		
		return accounts.get(number);
	}

}
