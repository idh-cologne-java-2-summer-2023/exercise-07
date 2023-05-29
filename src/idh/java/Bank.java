package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	//Hier wurde die private Map initialisiert
	private Map<Integer, Account> accountMap = new HashMap<>();


	public Bank() {
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			
			//Hier wurde die Map eingefügt, um an die Ids zu kommen
			accountMap.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	//Hier wurde die HashMap eingefügt
	public Account getAccount(int number) {
		 return accountMap.get(number);
	}

}
