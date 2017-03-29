package files1;
import java.io.*;  
//explains the methods of  FilePermission class
import java.security.PermissionCollection;  
public class FilePermission{  
       public static void main(String[] args) throws IOException {  
        String srg = "D:\\IO file\\java.txt";  
        FilePermission file1 = new FilePermission( srg, "read"); 
        FilePermission file12 = new FilePermission( srg, "delete"); 
        System.out.println(file1.hashCode());
        System.out.println(file1.getActions());
        System.out.println(file12.equals(file1));
        PermissionCollection permission = file1.newPermissionCollection();  
        permission.add(file1);  
			FilePermission file2 = new FilePermission(srg, "write");  
             permission.add(file2);  
             permission.add(file12);
             if(permission.implies(new FilePermission(srg, "execute"))) {  
             System.out.println("Read, Write permission is granted for the path "+srg );  
             }else {  
            System.out.println("No Read, Write permission is granted for the path "+srg);         }   
       }   
}
