package idh.java;


import java.util.Iterator;
import java.util.Map;

class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	Bank bank;
	
	public AccountIterator(Bank b) {
		this.bank = b;
	}
	
	@Override
	public boolean hasNext() {
		return currentPosition < bank.kvAccounts.size();
	}

	@Override
	public Account next() {
		currentPosition++;
		return bank.getAccount(currentPosition);
	}
	
}