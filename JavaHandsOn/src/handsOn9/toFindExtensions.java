package handsOn9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class toFindExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path fs=Paths.get("D:\\Assessment2\\Assessment\\src\\assessment");
		if(fs.getFileName().endsWith(".java"))
			System.out.println(fs.getFileName());
	}

}
