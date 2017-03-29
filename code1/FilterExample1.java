package files1;
//used all the methods of FiletrOutputStream class
import java.io.*;  
public class FilterExample1 {  
    public static void main(String[] args) throws IOException {  
        File data = new File("D:\\testout.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        byte b[]=new byte[30];
        /*int i=0,p=0;
		while(( i=filter.read())!=-1)
        {
       b[p]=(byte)i;
       p++;
        }*/
		//filter.read(b, 0, b.length);
        filter.skip(3);
       System.out.println( filter.available());
       filter.mark(6);
       filter.read();
       filter.read();
       filter.read();
       System.out.println(filter.markSupported());
       filter.reset();
        filter.read(b,3,b.length-3);
		for(int o:b)
		{
			System.out.print((char)o);
		}
        /*while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  */
        file.close();  
        filter.close();  
    }  
} 
