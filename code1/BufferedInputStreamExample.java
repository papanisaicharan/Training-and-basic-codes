package files1;
//program which show the usage of all the methods of BufferedInputStream
import java.io.*;  
public class BufferedInputStreamExample{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("D:\\testout.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    boolean k123=bin.markSupported();//returns whether mark and reset methods are supported or not
  System.out.println(k123);
byte[] i1=new byte[100];
bin.read(i1, 0, 4);
/*for(byte b:i1){				
	char charBuffer = (char)b;
System.out.print(charBuffer);
	}*/
  System.out.println((char)bin.read());
  System.out.println((char)bin.read());
  System.out.println((char)bin.read());
 bin.mark(6);
  System.out.println((char)bin.read());
  System.out.println((char)bin.read());
  System.out.println((char)bin.read());
  System.out.println((char)bin.read());
  bin.reset();
    while((i=bin.read())!=-1){    
     System.out.print((char)i);   
     System.out.print( bin.available());   
   //bin.skip(12);
    }
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  
