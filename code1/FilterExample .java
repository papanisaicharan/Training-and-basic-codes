package files1;
//explains basic methods of FilterExample class
import java.io.*;  
public class FilterExample {  
    public static void main(String[] args) throws IOException {  
        File data = new File("D:\\testout.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="saicharan daaaaa tantantadantanta";  
        filter.write(65);
        byte b[]=s.getBytes();      
        filter.write(b,0,5);
        filter.write(b, 5,b.length-5);
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  
} 
