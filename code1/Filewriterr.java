package files1;
//explains the methods of Filewriter class
import java.io.FileWriter;  
public class Filewriterr  {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.append('a');
           fw.write('A');
           fw.write("saicharan");
         //  fw.write("lamdikeeeeeeee", 2, 10);
          // System.out.println( fw.getEncoding());
          fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}
