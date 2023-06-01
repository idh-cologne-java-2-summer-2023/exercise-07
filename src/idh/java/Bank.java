import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
    private Map<String, Account> accountMap = new HashMap<>();

    public Bank() {
        // create accounts with varying balances
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            String accountNumber = generateRandomAccountNumber();
            Account account = new Account(accountNumber, random.nextInt(1000));
            accountMap.put(accountNumber, account);
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return accountMap.values().iterator();
    }

    public Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    private String generateRandomAccountNumber() {
        // Generate a random account number (for demonstration purposes)
        Random random = new Random();
        int length = random.nextInt(6) + 5; // Random length between 5 and 10
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
