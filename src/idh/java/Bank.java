package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;


public class Bank implements Iterable<Account> {
    private Account[] accounts = new Account[5];
    private HashMap<Integer, Account> accountMap;

    public Bank() {
        accountMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account(i, random.nextInt(1000));
            accounts[i] = account;
            accountMap.put(account.getAccountNumber(), account);
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return new AccountIterator(accounts);
    }

    public Account getAccount(int number) {
        return accountMap.get(number);
    }
}