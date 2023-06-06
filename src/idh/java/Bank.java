package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;


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

    public Account getAccount(int number) {
        Map<Integer, Account> accountMap = new HashMap<>();
        for (Account account : accounts) {
            accountMap.put(account.getId(), account);
        }
        
        Account requestedAccount = accountMap.get(number);
        if (requestedAccount != null) {
            return requestedAccount;
        } else {
            // Handle the case when the requested account is not found
            // For example, you can throw an exception or return a default account
            throw new IllegalArgumentException("Account not found for the given number: " + number);
        }
    }
}
