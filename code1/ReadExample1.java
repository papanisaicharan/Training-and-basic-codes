package files1;  
import java.io.*;  
//expains  the methods of the class ByteArrayInputStream
public class ReadExample1 {  
public static void main(String[] args) throws IOException {  
    FileInputStream file=new FileInputStream("D:\\testout.txt");
    byte b[]=new byte[100];
    int  i=0;
	int p=0;
	while(( i=file.read())!=-1)
    		{
    		b[p]=(byte)i;
    		p++;
    		}
   // ByteArrayInputStream byt = new ByteArrayInputStream(b,2,5);  
    ByteArrayInputStream byt = new ByteArrayInputStream(b);
    byt.read(b,0,2);
    System.out.println(byt.available());
    System.out.println(byt.markSupported());
    byt.mark(4);
    byt.skip(2);
    byt.reset();
    int k = 0,l=0;  
    while ((k = byt.read()) != -1 && l<p) {  
      //Conversion of a byte into character  
      char ch = (char) k;  
      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
    l++;
    }  
  }  
} 
