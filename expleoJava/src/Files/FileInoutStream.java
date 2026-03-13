package Files;
// READ THE FILE 
import java.io.FileInputStream;

public class FileInoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in= new FileInputStream("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO\\FILE.txt");
			System.out.println("Data in the file");
			int i = in.read();
		
			while(i !=-1) {
				System.out.print((char)i);
				i=in.read();
			}
			in.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
	}

}
