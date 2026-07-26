package handsOn10;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = sc.nextLine();
		HashMap<Character, Integer> n = new HashMap<>();
		char[] targets={'a', 'c', 'o', 's'};

        for (char t:targets) {
            n.put(t, 0);
        }
        for(char k:a.toCharArray()) {
        	if(n.containsKey(k)) {
        		n.put(k,n.get(k)+1);
        	}
        }
        System.out.println(n);
	}

}
