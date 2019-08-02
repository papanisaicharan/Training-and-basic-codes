package day4;

import java.util.Comparator;

public class SortByAccountNo implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getAccountno() - o2.getAccountno();
	}



}
