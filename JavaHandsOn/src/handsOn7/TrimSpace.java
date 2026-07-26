package handsOn7;

import java.util.*;

public class TrimSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String res = "";
		int start = 0, end = st.length() - 1;
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if (c == ' ') {
				start++;
			} else
				break;
		}
		for (int i = st.length() - 1; i >= 0; i--) {
			char c = st.charAt(i);
			if (c == ' ')
				end--;
			else
				break;
		}
		for (int i = start; i <= end; i++) {
			res += st.charAt(i);
		}
		System.out.println(res);
	}

}
