package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
		HashMap<Integer, String> bank_map = new HashMap<Integer, String>();
		bank_map(account, accounts);
		
		System.out.println("Der Account gehört zu der Kontonummer:" + bank_map);

	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		for (Account account : accounts) {
			if(account.getAccount() == number) {
				return account;
			}
	}
		return null;
		
	}
}

