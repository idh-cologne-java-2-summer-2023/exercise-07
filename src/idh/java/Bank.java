package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
    Map<Integer, Account> accounts = new HashMap<>();

    public Bank() {
        // create accounts with varying balances
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Account account = new Account(i, random.nextInt(1000));
            accounts.put(i, account);
        }
    }

    @Override
    public Iterator<Account> iterator() {
    	return new AccountIterator(accounts);
    }

    public Account getAccount(int number) {
        return accounts.get(number);
    }
}