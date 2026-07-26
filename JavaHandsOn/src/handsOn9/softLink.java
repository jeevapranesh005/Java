package handsOn9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class softLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("D:\\Assessment2\\Assessment\\src\\assessment");
		System.out.println("Files exists or not : "+Files.exists(p));
		System.out.println("Get Path : "+p);
		Path target = Paths.get("Add.txt");
		Path link = Paths.get("Add_link.txt");

		try {
		    Files.createSymbolicLink(link, target);
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