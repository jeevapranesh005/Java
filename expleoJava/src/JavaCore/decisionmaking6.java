package JavaCore;
//blood donate
public class decisionmaking6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		int weight = 590;
		
		if(age>15) {
			if(weight>50) {
				System.out.println("you are elibile to donate blood");
			}
			else {
				System.out.println("you are not elibile because weight is low");
			}
		}
		else {
			System.out.println("you are under age");
		}
	}

}
