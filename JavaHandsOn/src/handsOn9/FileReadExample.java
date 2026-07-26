package handsOn9;

import java.io.FileInputStream;

public class FileReadExample {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\tamil\\git\\repository7\\SmartCliff_Java_Expleo_Training\\src\\Assignment9\\input.txt");
			int i = in.read();
			while (i != -1) {
				System.out.print((char) i);
				i = in.read();
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}