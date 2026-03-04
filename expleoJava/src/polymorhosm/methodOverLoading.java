package polymorhosm;

import java.util.Scanner;

public class methodOverLoading {
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.println("enter a");
		double a = x.nextDouble();
		System.out.println("enter b");
		double b = x.nextDouble();
		
		System.out.println(add(a,b));
	}
}
