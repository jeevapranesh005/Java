package Files_handsOn_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class modified_time {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fs=Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");
		System.out.println(Files.getLastModifiedTime(fs));
	}

}

