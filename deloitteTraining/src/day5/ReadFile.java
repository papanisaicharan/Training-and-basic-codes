package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream i = new FileInputStream("C:\\Users\\admin\\Desktop\\files\\start.txt");
			System.out.println(i.available());
			int x;
			while((x = i.read()) != -1) {
				System.out.println((char)x);
			}
			i.close();
			System.out.println("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
