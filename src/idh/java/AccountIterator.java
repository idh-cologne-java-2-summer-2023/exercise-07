package idh.java;


import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	Map<Integer, Account> accounts = new HashMap<>();

    public AccountIterator(Map<Integer, Account> accounts) {
        this.accounts = accounts;
    }
	
	@Override
	public boolean hasNext() {
		return currentPosition < accounts.values().size();
	}

	@Override
	public Account next() {
		return accounts.get(currentPosition++);
	}
	
}