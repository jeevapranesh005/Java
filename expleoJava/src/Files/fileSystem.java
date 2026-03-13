package Files;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileSystem {
	public static void main(String[] args) {
		
		
		Path p1 = Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");
		Path normalizedPath=p1.normalize();
		
		
		Path p2 = Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\DESTOP\\frontEnd");
		System.out.println("Normalized: "+normalizedPath);
		
		Path subpath = p1.subpath(1, 3);
		System.out.println("Subpath : "+subpath);
		System.out.println("Get File Name : "+p1.getFileName());
		System.out.println("Get Parent : "+p1.getParent());
		System.out.println("Get Name Count : "+p1.getNameCount());
		System.out.println("Get Root : "+p1.getRoot());
		System.out.println("Get isAbsolute : "+p1.isAbsolute());
		System.out.println("toAbsoultPath : "+p1.toAbsolutePath());
		System.out.println("get uri : "+p1.toUri());
		
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not equals");
		}
		
	}
}
