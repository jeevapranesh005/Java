package JavaHomeWork;
//funtion 4
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vote(30);

	}
	public static void vote(int age) {
		if(age>=18) {
			System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("not eligible");
		}
	}

}
