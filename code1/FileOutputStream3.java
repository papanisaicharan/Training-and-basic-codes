package files1;
//it won't overwrite the file content but add the inserted content at the end of the content which is already present if it is true-boolean or else overwrites
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStream3 {
	public static void main(String[] args) throws IOException {
	      FileOutputStream fout=new FileOutputStream("D:\\testout.txt",false);   
        FileDescriptor fd = fout.getFD();
        System.out.println(fout .getChannel());
        System.out.println(" File descriptor of the file: "
                        + fd.hashCode());
        FileOutputStream fd1 = new FileOutputStream(fd);
        System.out.println(fd1.getChannel());
        System.out.println("Value of File Desciptor : "+fd1.getFD().hashCode());
       fout.write(74);
       fd1.write(73);
       fout.write(76);
       fout.close();
       fd1.close();
	}
}
