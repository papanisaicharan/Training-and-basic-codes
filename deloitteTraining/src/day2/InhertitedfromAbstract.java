package day2;

import day1.Task3ass;

public class InhertitedfromAbstract extends TestAbstract {

	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("subclass");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAbstract p = new InhertitedfromAbstract();
		p.display();
		p.output();
	}
}
