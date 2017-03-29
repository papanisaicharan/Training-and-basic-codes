package files1;
//example explains the methods of CharArrayReader class
import java.io.CharArrayReader;
import java.io.IOException;
public class CharArrayExample{
	public static void main(String [] args) throws IOException
	{
		char[] aee={'a','p','w','d','a','s','o','r','q'};
		CharArrayReader reader=new CharArrayReader(aee);
		int k=0;
		//reader.read(aee);
		System.out.println(reader.markSupported());
		//reader.skip(2);
		System.out.println((char)(reader.read()));
		reader.mark(0);
		System.out.println((char)(reader.read()));
		System.out.println((char)(reader.read()));
		System.out.println((char)(reader.read()));
		reader.reset();
		System.out.println((char)(reader.read()));
		System.out.println((char)(reader.read()));
		System.out.println(reader.ready());
		/*while((k=reader.read())!=-1)
		{
			char ch=(char)k;
			System.out.println(ch+" "+k);
		}*/
		reader.close();
	}
}
