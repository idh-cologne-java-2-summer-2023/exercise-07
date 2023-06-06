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
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		// on it
		
		HashMap<Integer, Integer> AccIDs = new HashMap<>();
		while(true){
		if (iterator().hasNext() == true){
			//Account classObj = new Account(number, number);
			Account.getId();
			Account.getBalance();
			AccIDs.put(Account.getId(),Account.getBalance());//I´m trying to add the new Account from the Bank method


		}
		return null;
	}
		
	}

}
