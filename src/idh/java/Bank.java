package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.function.IntBinaryOperator;
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
	
	public Account getAccount(int accountNumber) {
		
		// on it
		//testing...
		
		HashMap<Integer, Account> AccIDs = new HashMap<>();
		while(true){
		if (iterator().hasNext() == true){
			//Account classObj = new Account();
			//Account.getId();
			//Account.getBalance();
			AccIDs.put(123,accounts[0]);
			AccIDs.put(234, accounts[1]);
			AccIDs.put(345,accounts[2]);
			AccIDs.put(456,accounts[3]);
			AccIDs.put(567,accounts[4]);
            
			System.out.println(AccIDs.get(accountNumber));

			}
			


		
		else{
			return null;
		}
		return null;
	}
		
	}

}
