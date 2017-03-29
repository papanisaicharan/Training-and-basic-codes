//it overwrites the file content,inserts the elements as first come first place concepts of Ds
package files1;
import java.io.*;  
public class FileOutputStreamExample1 {  
    public static void main(String args[]){    
           try{    
        	  File file=new File("D:\\testout.txt");
        	      FileOutputStream fout=new FileOutputStream(file);    
            System.out.println( fout.getChannel());    //fout.getChannel();
            System.out.println(fout.getChannel());
             System.out.println(fout.getFD());
        
             FileDescriptor obj1=fout.getFD();
             System.out.println(obj1);            
            FileOutputStream fout1=new FileOutputStream( obj1);    
             fout1.write(55);
             fout1.write(57);
             String s="saicharan";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);  
             fout1.write(b,2, 4);
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}
