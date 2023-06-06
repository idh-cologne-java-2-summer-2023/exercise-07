package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<Integer, Account> map = new HashMap<Integer, Account>();

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
		
		HashMap<Integer, Account> map = new HashMap<Integer, Account>();
//		Set<Entry<Integer, Account>> myEntrySet = map.entrySet();
//		Account value = null;
		
		for ( Account account : accounts) 
				map.put(account.getId(), account);
		
		Account requestedAccount = map.get(number);
		return requestedAccount;
		
		
//		for (Entry<Integer, Account> e : myEntrySet) {
//			if (e.getKey() == number) {
//				value = e.getValue();
//			
//				return e.getValue();
//			}
//
//		}
//		return value;
		
		
	}

}
