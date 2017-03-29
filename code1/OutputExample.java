package files1;
//explains all the features of DataOutputStream class 
import java.io.*;  
public class OutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
       // byte[] b = new byte[10];
        String s="saicharan is here ....";
		//   data.writeInt(69);  
        byte[] b=s.getBytes();
        data.write(b, 0,4);
        data.writeBoolean(true);
        data.writeByte(1);
        data.writeShort(2);
        data.write(b, 0,4);
        data.writeInt(66);
        data.writeLong(12);
        data.writeUTF("sai..");
        data.writeDouble(8);
        data.writeFloat(56);
        data.write(68); 
        data.writeBytes("hi");
        data.writeChars("hello");
        data.writeBoolean(false);
       System.out.println( data.size());
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  
