package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Bank implements Iterable<Account> {
	private Map<Integer, Account> accounts = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int Accountnumber = i + 1;
            int balances = random.nextInt(1000);
            Account account = new Account(Accountnumber, balances);
            accounts.put(Accountnumber, account);
        }
	}
	
	@Override
	public Iterator<Account> iterator() {
		 return accounts.values().iterator();
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		return accounts.get(number);
	}

}
