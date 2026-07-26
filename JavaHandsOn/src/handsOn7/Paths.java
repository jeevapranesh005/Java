package handsOn7;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Path p1=Paths.get("D:\\Assessment2\\Assessment\\src\\assessment");
		Path normalizedPath=p1.normalize();
		Path p2=Paths.get("C:\\Users\\tamil\\OneDrive\\Documents");
		System.out.println("Normalization path : "+normalizedPath);
		Path subpath=p1.subpath(1,3);
		System.out.println("Subpath : "+subpath);
		System.out.println("Get file name : "+p1.getFileName());
		System.out.println("Get Parent : "+p1.getParent());
		System.out.println("Get Name count : "+p1.getNameCount());
		System.out.println("Get root : "+p1.getRoot());
		System.out.println("isAbsolute : "+p1.isAbsolute());
		System.out.println("toAbsolutePath : "+p1.toAbsolutePath());
		System.out.println("toUri : "+p1.toUri());
		if(p1.equals(p2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
	}

}
