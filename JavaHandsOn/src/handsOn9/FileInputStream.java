package handsOn9;

import java.io.FileInputStream;

public class FileReadExample {

	public static void main(String[] args) {

		try {
			FileInputStream input = new FileInputStream(
					"C:\\Users\\tamil\\git\\repository7\\SmartCliff_Java_Expleo_Training\\src\\Assignment9\\input.txt.txt");

			System.out.println("Data in the file:");

			int i = input.read();
			while (i != -1) {
				System.out.print((char) i);
				i = input.read();
			}

			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}