package handsOn7;

import java.util.*;

public class EncryptMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String message = s.nextLine();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			int n = c + 3;
			if (c >= 'a' && c <= 'z') {
				if (n > 122) {
					System.out.print((char) (n - 26));
				} else
					System.out.print((char) n);
			} else if (c == ' ') {
				System.out.print("_");
			} else {
				System.out.print(c);
			}
		}
	}

}
