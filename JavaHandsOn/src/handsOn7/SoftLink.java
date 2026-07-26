package handsOn7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path existingFilePath = Paths.get("C:\\Users\\tamil\\OneDrive\\Documents");
		Path symLinkPAth =Paths.get("D:\\Assessment2\\Assessment\\src\\assessment");
		try {
			Files.createSymbolicLink(symLinkPAth, existingFilePath);
			
		}catch(IOException x) {
			System.err.println(x);
		}catch (UnsupportedOperationException x) {
			System.err.println(x);
		}
	}

}
