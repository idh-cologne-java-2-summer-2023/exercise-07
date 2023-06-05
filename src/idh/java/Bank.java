package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[100];	
	HashMap<String, Account> acc = new HashMap<>(accounts.length);
	
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		accounts[0] = new Account(0,random.nextInt(1000));
		acc.put("1234@5678", accounts[0]);
		accounts[1] = new Account(1,random.nextInt(1000));
		acc.put("cat_haz_cash", accounts[1]);
		accounts[2] = new Account(2,random.nextInt(1000));
		acc.put("💸",accounts[2]);
		for (int i = 3; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			acc.put(String.valueOf(i), accounts[i]);
		}
		
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		return acc.get(number);
	}

}
