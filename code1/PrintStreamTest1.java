package files1;
//explains the methods of the PrintStream class
import java.io.FileOutputStream;  
import java.io.PrintStream;  
public class PrintStreamTest1{    
 public static void main(String args[])throws Exception{    
   FileOutputStream fout=new FileOutputStream("D:\\testout.txt ");    
   PrintStream pout=new PrintStream(fout);    
   pout.print(0);
   pout.print('S');
   char c[]={'a','b','c'};
   pout.print(c);
   pout.print(12.222);
   pout.println(2016);    
   pout.println("Hello Java");    
   pout.println("haha---------------------- Java");    
   pout.close();    
   fout.close();    
   int a=11;
   System.out.printf("%d",a);
  System.out.println("Success");    
  System.out.format("%d",a);
 }    
} 
