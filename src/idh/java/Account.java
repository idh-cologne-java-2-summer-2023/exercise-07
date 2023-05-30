package idh.java;


/**
 * This class represents an account in our bank.
 * @author reiterns
 *
 */
public class Account<T> {
	// the balance of the account
	int balance;
	
	// the id of the account
	T id;

	public Account(T id, int status) {
		this.id = id;
		this.balance = status;
	}
	
	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int status) {
		this.balance = status;
	}
	
	/**
	 * Withdraws a sum of money from the account
	 * @param sum
	 */
	public void withdraw(int sum) {
		this.balance = balance - sum;
	}
	
	
}
