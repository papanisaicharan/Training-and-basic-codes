import java.net.*;  
import java.io.*;  
class Client{  
public static void main(String args[])throws Exception{ 
	InetAddress ip=InetAddress.getByName(null);  
		  
		//System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());
	Socket s=new Socket("192.1.1.1",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
String str="",str2="";  
while(!str.equals("stop")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Server says: "+str2);  
}  
  
dout.close();  
s.close();  
}}  
