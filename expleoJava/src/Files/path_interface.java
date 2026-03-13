package Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
public class path_interface {
	public static void main(String[] args) {
//		Path p1= Paths.get("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");
//		Path p2 = p1.subpath(1,3);
//		System.out.px`rintln(p2);
		

        FileSystem fs = FileSystems.getDefault();
        Path p1 = fs.getPath("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");
        System.out.println(p1);
	}
}
