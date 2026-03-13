package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream1 {

    public static void main(String[] args) {

        byte b[] = new byte[128];

        try {

            FileInputStream fi = new FileInputStream("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO\\in.txt");
            FileOutputStream fo = new FileOutputStream("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO\\out.txt");

            System.out.println(fi.available());

            int read = 0;
            int c = 0;

            while ((read = fi.read(b)) != -1) {
                fo.write(b, 0, read);
                c += read;
            }

            System.out.println("total : " + c);

            fi.close();
            fo.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}