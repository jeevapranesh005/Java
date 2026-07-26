package handsOn7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fileexist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p=Paths.get("C:\\Users\\tamil\\OneDrive\\Documents\\gi.txt");
		Files.createFile(p);
	}

}
