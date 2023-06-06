package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
    private Map<Integer, Account> accounts = new HashMap<>();

    public Bank() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int accountNumber = i;
            int balance = random.nextInt(1000);
            Account account = new Account(accountNumber, balance);
            accounts.put(accountNumber, account);
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return accounts.values().iterator();
    }

    public Account getAccount(int number) {
        return accounts.get(number);
    }
}