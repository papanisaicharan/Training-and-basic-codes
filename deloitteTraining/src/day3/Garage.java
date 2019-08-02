package day3;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane areo = new Aeroplane();
		Bus bus = new Bus();
		System.out.println("checking how aeroplane details");
		areo.wheels();
		areo.engine();
		areo.start();
		areo.stop();
		System.out.println("checking how bus details");
		bus.wheels();
		bus.engine();
		bus.start();
		bus.stop();
	}

}
