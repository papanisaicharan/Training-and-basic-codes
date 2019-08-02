package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilaize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\files\\studentobj.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object s1;
			while((s1 = ois.readObject()) != null) {
				Student a = (Student) s1;
				System.out.println(a);
			}
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
	}

}
