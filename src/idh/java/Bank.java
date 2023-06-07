package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements  Iterable<Account>{
    private Map<Integer, Account> accounts = new HashMap<>();

    public Bank() {
        // create accounts with varying balances
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int accountNumber = i + 1; // Assume account numbers start from 1
            int initialBalance = random.nextInt(1000);
            Account account = new Account(accountNumber, initialBalance);
            accounts.put(accountNumber, account);
        }
    }

    public Account getAccount(int number) {
        return accounts.get(number);
    }
}
