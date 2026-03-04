package JavaHomeWork;
// function medium 2
public class primeRange {
	public static void main(String[] args) {
		int start =8;
		int end = 5;
		prime(start,end);
		
	}
static void prime(int s,int e) {
		
		if(e<2) {
			System.out.println("it is not a prime number");
		}
		if(s<e) {
			for(int i =s;i<=e;i++) {
				int count =0;
				for(int j=2;j<=i;j++ ) {
					if(i%j==0) {
						count++;
					}
					
				}
				if(count<2) {
					System.out.print(i+" ");

				}
				
		}
			
	}
	else {
			System.out.println("Provide valid input");
		
		
	}
	}
}
