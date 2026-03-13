package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class symbolic {

    public static void main(String[] args)  {

        Path existingfilepath = Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\DESTOP\\frontEnd");
        Path symbolicmainPath = Paths.get("C:\\frontEnd");

        try {
            Files.createSymbolicLink(symbolicmainPath, existingfilepath);
            System.out.println("Symbolic link created successfully");
        } 
        catch (IOException x) {
            System.err.println(x);
        }
        catch (UnsupportedOperationException x) {
            System.err.println(x);
        }
    }
}