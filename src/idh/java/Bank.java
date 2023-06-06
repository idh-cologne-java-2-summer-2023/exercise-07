package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
    private Map<Integer, Account> accountMap = new HashMap<>();

    public Bank() {
        // create accounts with varying balances
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Account account = new Account(i, random.nextInt(1000));
            accountMap.put(account.getId(), account);
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