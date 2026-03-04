package JeevaPranesh_Assessment_13;
import java.util.Scanner;
public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);

       
        int input1 = x.nextInt();
        int input2 = x.nextInt();
        int input3 = x.nextInt();
        int h1 = input1 / 100,t1 = (input1 / 10) % 10, o1 = input1 % 10;
        int h2 = input2 / 100, t2 = (input2 / 10) % 10, o2 = input2 % 10;
        int h3 = input3 / 100, t3 = (input3 / 10) % 10, o3 = input3 % 10;
        int hundreds = Math.min(h1, Math.min(h2, h3));
        int tens = Math.min(t1, Math.min(t2, t3));
        int ones = Math.min(o1, Math.min(o2, o3));

       
        int maxDigit = 0;
        int[] digits = {h1,t1,o1,h2,t2,o2,h3,t3,o3};
        for(int d : digits){
            if(d > maxDigit){
                maxDigit = d;
            }
        }
        int pin = maxDigit * 1000 + hundreds * 100 + tens * 10 + ones;

        // Output
        System.out.println(pin);
	}

}
