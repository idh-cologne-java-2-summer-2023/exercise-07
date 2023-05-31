package idh.java;


import java.util.Iterator;

class AccountIterator implements Iterator<Account> {
	Bank bank;
	int counter;
	
	public AccountIterator(Bank bank) {
		this.bank = bank;
		counter = 0;
	}
	
	@Override
	public boolean hasNext() {
		return counter < bank.size();
	}

	@Override
	public Account next() {
		Account a = bank.getAccount(counter);
		counter++;
		return a;
	}
	
}