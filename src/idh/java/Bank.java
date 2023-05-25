package idh.java;


import java.util.HashMap;
import java.util.Random;

public class Bank {
	HashMap<Integer,Account> map = new HashMap<Integer,Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Account temp =  new Account(i, random.nextInt(1000));
			map.put(temp.getId(),temp);
		}
	}
	
	public Account getAccount(int number) {
		return map.get(number);
	}

}
