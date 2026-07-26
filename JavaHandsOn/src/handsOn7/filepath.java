package handsOn7;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filepath {
	public static void main(String[] args) {
		FileSystem fs=FileSystems.getDefault();
	    Path p=fs.getPath("D:\\Assessment2\\Assessment\\src\\assessment");
	    System.out.println(p);
		Path p1=Paths.get("D:\\Assessment2\\Assessment\\src\\assessment");
		Path p2=p1.subpath(2, 3);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
