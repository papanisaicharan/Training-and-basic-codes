package day3;


public class Bus implements Vehicle {

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("bus will have 8 wheels");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("bus will have 1 engine");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("bus will have 1 step in start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("bus will have 1 step in stop");
	}

}

