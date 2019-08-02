package day3;

public class ExceptionTask {

	public static void main(String[] args) {
		int x = 0;
		int y = 6;
		int arr[] = {1,2,3,4,5,6};
		try {
			int p = y/x;
			System.out.println(p);
			System.out.println(arr[30]);
		} catch (ArithmeticException e) {
			System.out.println("arithematic error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index is out of range");
		}
		///if need we can tackle the exceptions in single catch
	}

}
