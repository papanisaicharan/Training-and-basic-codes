package day1;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task3ass t = new Task3ass();
//		t.setAcno(10001);
//		t.setBalance(10000);
//		t.setCustname("saicharan");
		Task3ass t = new Task3ass(10001,"saicharan",10000);
		System.out.println(t.getAcno());
		System.out.println(t.getBalance());
		System.out.println(t.getCustname());
	}

}
