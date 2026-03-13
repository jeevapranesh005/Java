package Files;


import java.io.FileOutputStream;
public class fileOutputStream {
	public static void main(String[] args) {
		
		String data = "Welcome to expleo";
		
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\jeeva\\OneDrive\\Desktop\\EXPLEO\\FILE.txt");
			byte [] arr= data.getBytes();
			output.write(arr);
			
			output.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
