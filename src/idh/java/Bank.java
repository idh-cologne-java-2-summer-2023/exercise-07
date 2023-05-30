package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	HashMap<String, Account> hash = new HashMap<String, Account>();
	
	public void Hash() {
		hash.put("Heinz Dieter", accounts[0]);
		hash.put("Egbert Bover", accounts[1]);
		hash.put("Emily Silva", accounts[2]);
		hash.put("Vroom Vroom", accounts[3]);
		hash.put("Hunfrid Anti", accounts[4]);
	//	System.out.println(hashAcc);
	}
	
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
		for (Account account : hash.values()) {
			if (account.getId() == number)
				return account;
		}
		return null;
	}

}
