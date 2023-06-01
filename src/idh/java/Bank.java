package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	HashMap<Integer,Integer> accounts = new HashMap<Integer,Integer>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			accounts.put(i, random.nextInt(1000));
		}
	}
	//Ich seheh keinen Sinn darin einen Iterator in Verbindung mit einer HashMap zu verwenden.
	//Zudem macht die containsKey() Function meines Wissens nach eine Iterierung nur leistungsaufwendiger.
	//Demnach ist der Geldautomat nun dysfunktional.
	// Für einen funktionierende Version des Geldautomaten mit Acc HashMap, Verweis auf Aufgabe zwei Mainlane2000.
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Integer getAccount(int number) throws Exception {
		if(accounts.containsKey(number)) {
			return  (accounts.get(number));
		} else {
			throw new Exception("you dont posses a account at this bank");
		}
	}

}
