package day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fins = new FileOutputStream("C:\\Users\\admin\\Desktop\\files\\studentobj.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fins);
			Student s1 = new Student(100,"sai","c");
			Student s2 = new Student(101,"sai1","b");
			Student s3 = new Student(102,"sai2","c");
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			System.out.println("success");
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
