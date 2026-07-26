package handsOn9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class lastModifiedTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fs=Paths.get("D:\\Assessment2\\Assessment\\src\\assessment");
		System.out.println(Files.getLastModifiedTime(fs));
	}

}
