package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
   public Map<Integer, Account> map = new HashMap<>();

    public Bank() {
        // create accounts with varying balances
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Account account = new Account(i, random.nextInt(1000));
            map.put(i, account);
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return map.values().iterator();
    }

    public Account getAccount(int number) {
        return map.get(number);
    }
}
