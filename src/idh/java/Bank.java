package idh.java;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;



  public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<Integer, Account> Account = new HashMap<>();
	

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
		
		
     	Account.put(456, accounts[0]);
		Account.put(232, accounts[1]);
		Account.put(111, accounts[2]);
		Account.put(567, accounts[3]);
		Account.put(662, accounts[4]);
		
		for (Integer i: Account.keySet()) {
			System.out.println("Number: " + i + " Account: " + Account.get(i));
		} 
		
		return Account.get(Account);
		
	} 

}
