package JavaHomeWork;
//function 2
public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prime(10);
		

	}
	
	static void prime(int n) {
		
		if(n<2) {
			System.out.println("it is not a prime number");
		}
		else {
			for(int i =2;i<=n;i++) {
				int count =0;
				for(int j=2;j<=i;j++ ) {
					if(i%j==0) {
						count++;
					}
					
				}
				if(count<2) {
					System.out.println(i);
					
				
				
				}
			}
		}
	}

}
