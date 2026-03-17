package HandsOn_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question_1 {
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.print("How many names do you want to input? ");
		int n = x.nextInt();
		List <String> li = new ArrayList<>(n);
		for(int i =0;i<n;i++) {
			System.out.print("Enter name #"+i+1+" ");
			li.add(x.next());
		}
		
		System.out.println("Names longer than 5 characters:");
		for(String si:li) {
			if(si.length()>5){
				System.out.println(si);
			}
		}
		
		
	}
}
