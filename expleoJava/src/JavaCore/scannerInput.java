package JavaCore;
import java.util.Scanner;
public class scannerInput {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		//int 
		System.out.print("enter number :");
		int num = x.nextInt();
		System.out.print("enter name :");
		x.nextLine();                           //dount;;        // important :-
		String name = x.nextLine();
		
		System.out.print("Enter double :");
		double decimal = x.nextDouble();
		System.out.print("enter the letter :");
		char letter = x.next().charAt(0);
		System.out.print("enter word :");
		String word = x.next();
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(decimal);
		System.out.println(letter);
		System.out.println(word);
		
	}
}
