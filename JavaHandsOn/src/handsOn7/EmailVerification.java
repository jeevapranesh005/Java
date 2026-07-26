package handsOn7;

import java.util.*;

public class EmailVerification {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		char[] a = st.toCharArray();
		if (st.contains("@")) {
			if (!((a[0] >= 'a' && a[0] <= 'z') || (a[0] >= 'A' && a[0] <= 'Z')))
				return;
			for (int i = 0; i < st.length() - 1; i++) {
				if ((a[i] == '.' && a[i + 1] == '.') || (a[i] == '_' && a[i + 1] == '_')
						|| (a[i] == '-' && a[i + 1] == '-') || (a[i] == '-' && a[i + 1] == '_')
						|| (a[i] == '_' && a[i + 1] == '.') || (a[i] == '.' && a[i + 1] == '_')
						|| (a[i] == '-' && a[i + 1] == '.') || (a[i] == '@' && a[i + 1] == '_')
						|| (a[i] == '@' && a[i + 1] == '-') || (a[i] == '@' && a[i + 1] == '.')
						|| (a[i] == '-' && a[i + 1] == '@') || (a[i] == '.' && a[i + 1] == '@')
						|| (a[i] == '_' && a[i + 1] == '@'))
					return;
				if (!(a[i] == '_' || a[i] == '-' || a[i] == '.' || (a[i] >= '0' && a[i] <= '9')
						|| (a[i] >= 'a' && a[i] <= 'z') || a[i] == '@'))
					return;
			}
		} else
			return;
		char c = a[a.length - 1];
		if (c == '.' || c == '_' || c == '-' || c == '@')
			return;
		System.out.println(st);
	}
}