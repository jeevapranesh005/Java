package JavaHomeWork;
//function 1
public class AddOddEven {
	public static void main(String[] args) {
		add(10);
	}
	public static void add(int n) {
		
		int odd=0;
		int even=0;
		
		for(int i =1;i<=n;i++) {
			if(i%2==0) {
				even +=i;
			}
			else {
				odd +=i;
			}
		}
		
		System.out.println("the even number "+even);
		System.out.println("the odd number "+odd);
	}
}
