package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class create_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p=Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO\\FILE.txt");
		Files.createFile(p);
	}

}
