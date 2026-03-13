package Files_handsOn_9;

import java.io.File;

public class CheckFileOrDirectory {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO");

        if (file.exists()) {

            System.out.println("The file or directory exists.");
        } 
        else {
            System.out.println("The file or directory does NOT exist.");
        }
    }
}