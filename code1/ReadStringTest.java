package files1;

import java.io.*;
//explains the methods of Console class to me
class ReadStringTest{    
public static void main(String args[]) throws IOException{    

Console c=System.console();    
/*Reader  p=c.reader();
PrintWriter k=c.writer();
String str="saicharan";
System.out.println(" ");    
c.format(str, args);
System.out.println(" ");    
c.printf(str, args);
String str1 = "hi";
c.readLine(str1, args);
System.out.println(str1);*/
PrintWriter out = c.writer();
out.println("hey sucess dude");
Reader in = c.reader();
System.out.println("Enter your name: "); 
int k=in.read(); 
String n=c.readLine();    
System.out.println("Welcome "+(char)k+n); 
String fmt = "%1$4s %2$10s %3$10s%n";
c.format(fmt, "hi", "dude", "whatsup");
String fmt1 = "%1$4s %2$10s %3$10s%n";
c.printf(fmt1,"hey","hi","wbn");
String s=c.readLine("name=");
System.out.println("typed name="+s);
String g=c.readLine();
System.out.println("typed name="+g);
char a[]=c.readPassword(fmt,"type","the","password");
System.out.println("typed password:");
int i;
for(i=0;i<a.length;i++)
	{
System.out.print(a[i]);
	}
	c.flush();
	
}    
}  
	
