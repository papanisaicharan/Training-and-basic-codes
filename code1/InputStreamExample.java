package files1;
//uses all the mwthods of SequenceInputSTream class
import java.io.*;  
class InputStreamExample {    
  public static void main(String args[])throws Exception{    
   try{
	  FileInputStream input1=new FileInputStream("D:\\testin.txt");    
   FileInputStream input2=new FileInputStream("D:\\testout.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   byte b[]=new byte[100];
   inst.read(b,0,4);
   int q=0;
   for(int p:b)
   {
	   System.out.println((char)p+"hi");
	   q++;
	   if(q==4)
	   break;
   }
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
    System.out.println(inst.available());
   }    
   inst.close();    
   input1.close();    
   input2.close();    
   }
   catch(Exception e)
   {
	   System.out.println("file not found");
   }
  }    
} 
