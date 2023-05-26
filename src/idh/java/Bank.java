package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	static Map<Object, Account> map = new HashMap<Object, Account>();
	static int length = 5;
	static Account[] accounts = new Account[length];
	
	public Bank() {
		Random random = new Random();
		int amount =  random.nextInt(1000);
		for (int i = 0; i < length; i++) {
			Account account = new Account(i, amount);
			map.put(i, account);
			accounts[i] = account;
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public static Account getAccount(Object number) {
		for(int i = 0; i < map.size(); i++) {
			if(number.equals(map.get(number).id)){
				Account account = map.get(number);
				return account;
			}else {
				System.out.println("Account nicht gefunden");
			}
		}
		return null;
	}
	
	public static void changeNumber(Object currentNumber, Object newNumber) {
		Account account = getAccount(currentNumber);
		account.setId(newNumber);
		System.out.println(account.id);

	}
	
	public static void main(String[] args) {
		//Aufgabe 1
		Bank bank = new Bank();
		System.out.println(map.get(0));
		System.out.println(accounts[0]);
		System.out.println(getAccount(3));
		
		//Aufgabe 2
		changeNumber(2, "💸");
		changeNumber(3, "cat_haz_cash");
		changeNumber(4, "1234@5678");
		
	}
}
