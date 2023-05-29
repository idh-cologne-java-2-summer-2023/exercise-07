package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	
	private HashMap<Integer, Account> accountsMap = new HashMap<Integer, Account>();
	Account[] accounts = new Account[5];
	
	

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			accountsMap.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		
		for (int i = 0; i < accountsMap.size(); i++) {
			if(number == accountsMap.get(number).id) {
				Account account = accountsMap.get(number);
				return account;
			}else {
				System.out.println("Account not found.");
			}
		}
		return null;
	}

}
