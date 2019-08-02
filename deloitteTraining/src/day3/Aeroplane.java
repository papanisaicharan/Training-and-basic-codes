package day3;

public class Aeroplane implements Vehicle {

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("aeroplane have 10 wheels");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("aeroplane have 3 engines");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("aeroplane have multiple steps in start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("aeroplane have to excecuting engine in stop");
	}

}
