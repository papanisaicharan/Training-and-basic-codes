package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\admin\\Desktop\\files");		
		Scanner s = new Scanner(System.in);
		System.out.println(file.mkdir());
		try {
			FileOutputStream o = new FileOutputStream("C:\\Users\\admin\\Desktop\\files\\start1.txt");
			FileInputStream i = new FileInputStream("C:\\Users\\admin\\Desktop\\files\\start.txt");
			//copy form one file to other
			int x;
			while((x = i.read()) != -1) {
				System.out.println((char)x);
				o.write((char)x);
			}
			//getting the user input and writing in file.
			String str= s.nextLine();
			byte[] b = str.getBytes();
			o.write(b);
			i.close();
			o.close();
			System.out.println("copied Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
