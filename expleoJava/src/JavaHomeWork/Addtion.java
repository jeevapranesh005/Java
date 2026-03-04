package JavaHomeWork;
//function mediuum 1
public class Addtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start =1;
		int end =1000;
		add(start,end);

	}
	public static void add(int start ,int end) {
		
		int odd =0;
		int even =0;
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				even +=i;
			}
			else {
				odd +=i;
			}
		}
		
		int diff=even-odd;
		System.out.println("The sum of odd numbers from "+start+" to "+end +" "+odd);
		System.out.println("The sum of even numbers from "+start+" to "+end +" "+even);
		System.out.println("The absolute difference between the two sums is: "+diff);
	}

}
