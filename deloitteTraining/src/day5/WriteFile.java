package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\admin\\Desktop\\files");
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.toURI());
		
		//System.out.println(file.mkdir());
		
		try {
			FileOutputStream o = new FileOutputStream("C:\\Users\\admin\\Desktop\\files\\start.txt");
			for(char i = 65;i<=90;i++) {
				o.write(i);
			}
			o.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
