package String;
import java.io.*;

public class string_1 {
	public static void concate(String s) {
		s=s+" welcome";
	}
	
	public static void concate2(StringBuilder s1) {
		s1.append(" happy morning");
	}
	
	public static void concate3(StringBuffer s2) {
		s2.append("good afternoon");
	}
	
	public static void main(String[] args) {
		String s1 = "jeeva";
		concate(s1);
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("jeeva");
		concate2(s2);
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("Jeeva");
		concate3(s3);
		System.out.println(s3);
	}
}
