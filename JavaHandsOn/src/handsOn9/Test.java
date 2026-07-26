package handsOn9;
import java.io.File;

public class Test {
	public static void main(String[] args) {

		File p = new File("D:\\Assessment2\\Assessment\\src\\assessment");

		System.out.println("Exists: " + p.exists());
		System.out.println("Path: " + p.getAbsolutePath());
		System.out.println("Readable: " + p.canRead());
		System.out.println("Writable: " + p.canWrite());

	}
}