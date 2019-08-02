package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter the details");
		int code = Integer.parseInt(br.readLine());
		String name = br.readLine();
		double sal = Double.parseDouble(br.readLine());
		System.out.println(code+name+sal);
	}

}
