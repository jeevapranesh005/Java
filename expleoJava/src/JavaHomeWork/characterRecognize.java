package JavaHomeWork;
/**
 * find the given character is voul or consonat or symbol
    */
import java.util.Scanner;
public class characterRecognize {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		char ch1 = x.next().charAt(0);
		char ch = Character.toLowerCase(ch1);
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':{
			System.out.println("vowel");
			break;
		}
		default:
			if(ch >='a'&& ch<='z') {
				System.out.println("consonant");
			}
			else {
				System.out.println("symbol");
			}
		}
	}
}
