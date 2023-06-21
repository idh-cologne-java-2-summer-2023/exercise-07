package idh.java;


import java.util.Iterator; 
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	private HashMap<Integer, Account> accountMap;

	

	public Bank() {
        accountMap = new HashMap<>();
        // Erstellen Sie die Accounts mit verschiedenen Kontonummern und Salden
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Account account = new Account(i, random.nextInt(1000));
            accountMap.put(account.getAccountNumber(), account);
        }
      
	}

	@Override
	public Iterator<Account> iterator() {
		   return accountMap.values().iterator();
	}
	
	public Account getAccount(int number) {
	    return accountMap.get(number);
	    
		}

}


