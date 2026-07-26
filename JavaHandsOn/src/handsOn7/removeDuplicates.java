/*
 * 1.Write a Java method that removes all duplicate characters from a given string while 
preserving the order of first appearance. 
Constraints: 
• Ignore case for duplication comparison (optional based on requirement) 
• Do not use Set<String> built-in removal methods 
• Use your own logic + frequency/boolean array 
Sample Input: 
corporate assignment 
Sample Output: 
corpte asingm
 */
package handsOn7;

import java.util.*;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String res = "";
		boolean[] seen = new boolean[256]; // total ascii values
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if (!seen[c]) { // it will check whether is character is already went
				res += c;
				seen[c] = true; // once visited it change false to true
			}
		}
		System.out.println(res);
	}

}
