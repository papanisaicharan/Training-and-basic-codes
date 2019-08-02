package day3;

@SuppressWarnings("serial")
class SampleException extends Exception{

	public SampleException() {
		super("custom exception ....! bro");
	}
	
}

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =15;
		try {
			if(age < 20) {
				throw new SampleException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
