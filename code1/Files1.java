package files;

import java.io.*;

class Login implements Serializable
{
	String uname,pWard;
	Login(String pp,String p1)
	{
		this.uname=pp;
		this.pWard=p1;
	}
	public String toString()
	{
		return "uname="+uname+"  pWard="+pWard;
	}
}
public class Demoserilization {

	public static void main(String[] args) throws IOException{
		Login obj1=new Login("sai","charan");
		System.out.println("--------dis obj1----------");
		System.out.println(obj1);
		System.out.println("hashcode of obj1="+obj1.hashCode());
		FileOutputStream fos=new 	FileOutputStream("sai3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		oos.close();
		try 
		{
			FileInputStream fis=new FileInputStream("sai3.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Login obj2=(Login)ois.readObject();
			System.out.println("---dis obj2---");
			System.out.println(obj2);
			System.out.println("hashcode obj2="+obj2.hashCode());
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println("hi its wrong khblib");
		}
	}

}
