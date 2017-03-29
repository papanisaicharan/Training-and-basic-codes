//it overwrites the file content,inserts the elements as first come first place concepts of Ds
package files1;
import java.io.FileDescriptor;
import java.io.FileOutputStream;  
public class FileOutputStreamExample2 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="saicharan.";   
             FileDescriptor fout12=fout.getFD();
             FileOutputStream fout1=new FileOutputStream(fout12);    
             byte b[]=s.getBytes();//converting string into byte array    
             fout1.write(67);
             fout1.write(67);
             fout1.write(b, 5,10);
             fout1.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  
