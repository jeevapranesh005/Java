package Files_handsOn_9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FhH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");
		System.out.println("Files exists or not : "+Files.exists(p));
		System.out.println("Get Path : "+p);
		Path target = Paths.get("Add.txt");
		Path link = Paths.get("Add_link.txt");

		try {
		    Files.createSymbolicLink(link, target);
		    System.out.println("Soft link created");
			} 
		catch (Exception e) {
		    System.out.println(e);
		}
		
		File f = new File("Add.txt");
		if(f.canRead()) {
			System.out.println("Readable");
		}
		else {
			System.out.println("not readable");
		}
	}

}