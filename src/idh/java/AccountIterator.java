package idh.java;


import java.util.HashMap;
import java.util.Iterator;

class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	HashMap<Integer, Integer> accounts;
	
	public AccountIterator(HashMap<Integer, Integer> accounts2) {
		this.accounts = accounts2;
	}
	
	@Override
	public boolean hasNext() {
		return currentPosition < accounts.size();
	}

	@Override
	public Account next() {
		return null;//accounts[currentPosition++];
	}
	
}