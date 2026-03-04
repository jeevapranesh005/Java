package JavaCore;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// get the date..
public class ScannerInput01 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);


		System.out.println("Enter the ID");
		int ID = x.nextInt();
		x.nextLine();
		System.out.println("Enter the Name:");
		String name1 = x.nextLine();
		System.out.println("Enter the des:");
		String des = x.nextLine();
		System.out.println("Enter the language");
		String lang = x.next();
		System.out.println("Enter the genre: ");
		String genre = x.next();
		
		// important
		System.out.println("Enter the date");
		String date1 = x.next();
		SimpleDateFormat moviedate1 = new SimpleDateFormat("dd/MM/yyyy");
		Date Date = moviedate1.parse(date1);
		
		
		System.out.println("movie seat cost");
		int seatprice = x.nextInt();

		System.out.println(ID);
		System.out.println(name1);
		System.out.println(des);
		System.out.println(lang);
		System.out.println(genre);
		System.out.println(Date);
		System.out.println(seatprice);
		

	}

}
