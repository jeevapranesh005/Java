package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charStream {

	public static void main(String[] args) throws IOException {
		char[] b = new char[128];

		try {
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1]);
                 
			int count = 0;
			int read = 0;

			while ((read = fr.read(b)) != -1) {
				fw.write(b, 0, read);
				count += read;
			}

			fr.close();
			fw.close();

			System.out.println("Total count : " + count + " character");

		} catch (FileNotFoundException f) {
			System.out.println(f);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}