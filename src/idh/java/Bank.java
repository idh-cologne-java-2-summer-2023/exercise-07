package idh.java;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	//Account[] accounts = new Account[5];
	HashMap<Integer, Account> accountsHashMap = new HashMap<>();
	int accAnzahl = 5;
	
	public Bank() {
		// create accounts with varying balances
		
		Random random = new Random();
		for (int i = 0; i < accAnzahl; i++) {
			accountsHashMap.put(i, new Account(i, random.nextInt(1000)));
		
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accountsHashMap);
	}
	
	public Account getAccount(int number) {		
		for (Integer key : accountsHashMap.keySet()) {
			if (key == number) {
				return accountsHashMap.get(key);
			}
		}
		return null;
	}

}
