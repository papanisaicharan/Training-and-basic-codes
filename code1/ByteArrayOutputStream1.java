package files1;
//used all the methods of the class ByteArrayOutputStream
import java.io.*;  
import java.io.ByteArrayOutputStream;;
public class  ByteArrayOutputStream1 {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("D:\\testin.txt");    
      FileOutputStream fout2=new FileOutputStream("D:\\testout.txt");    
        
      ByteArrayOutputStream bout12 =new ByteArrayOutputStream();    
      System.out.println(bout12.size());
      bout12.write(65);
       String str="hyderabad is a great city";
      byte b1[]=str.getBytes();
  bout12.write(b1,0,b1.length);
  byte v[]=bout12.toByteArray();
  for(byte p:v)
  {
	  System.out.print((char)p);
  }
      //bout12.write(b1,0,6);
      System.out.println(bout12.size());
      System.out.println(bout12.toByteArray());//printing in the forms of bytes
      System.out.println(bout12.toString());
      System.out.println(bout12.toString("UTF-8"));
      System.out.println(bout12.toString("Cp1047"));
      bout12.writeTo(fout1);
      bout12.reset();
      bout12.write(69);
      bout12.write(73);
      bout12.writeTo(fout2);
    fout1.close();
    fout2.close();
    System.out.println("Success...");    
     }    
    }   
