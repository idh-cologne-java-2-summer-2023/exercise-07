package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[10];

	HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();
	/*public static void Lambda(HashMap<Integer, Account> map) {
		map.forEach((key, value) -> {
			System.out.println("Key= " + key + ", Value= " + value);
		});
	}*/
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			hmap.put(i, accounts[i]);
			//Lambda(hmap);
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return hmap.values().iterator();
	}

	public Account getAccount(int accountNumber) {
		return hmap.get(accountNumber);
	}
}