package idh.java;


import java.util.HashMap;

import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
    static HashMap<Integer, Integer> people = new HashMap<Integer, Integer>();

	

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
			people.put(4711, 1);
		    people.put(4712, 2);
		    people.put(4713, 3);
		    people.put(232, 4);
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
	if(people.containsKey(number)) {
		int temp = people.get(number);
		return accounts[temp];
}	else {
		return null;
}
	
	}

}
