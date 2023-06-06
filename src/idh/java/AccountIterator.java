package idh.java;

import java.util.HashMap;
import java.util.Iterator;

class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	//Account[] accounts;
	HashMap<Integer, Account> accountsHashMap = new HashMap<>();
	
	public AccountIterator(HashMap<Integer, Account> accountsHashMap) {
		this.accountsHashMap = accountsHashMap;
	}
	
	@Override
	public boolean hasNext() {
		return currentPosition < accountsHashMap.size();
	}

	@Override
	public Account next() {
		return accountsHashMap.get(currentPosition++);
	}
	
}