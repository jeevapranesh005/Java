package Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class io_Stream_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bfr = new BufferedReader(new  FileReader(args[0]));
			BufferedWriter bfw = new BufferedWriter(new FileWriter(args[1]));
			String line ="";
			while((line=bfr.readLine())!=null) {
				bfw .write(line);
				bfw.newLine();
			}
			bfr.close();
			bfw.close();
	}catch(FileNotFoundException f) {
		System.out.println(f);
	}catch(IOException e) {
		System.out.println(e);
	}

}
}
