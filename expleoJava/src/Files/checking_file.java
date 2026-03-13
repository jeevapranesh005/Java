package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class checking_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p=Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");
		boolean  result=Files.exists(p);
		System.out.println(result);
		
		
		boolean  result1=Files.isReadable(p);
		System.out.println(result1);
		
		
	}

}
