package oops;

//static method
public class threatreScreen {
	private static int totalSeat =20;
	
	threatreScreen(){
		System.out.println("current seat avalible is "+totalSeat);
	}
	public  void bookticket(int seat) {
		if(seat<totalSeat) {
			totalSeat -=seat;
			System.out.println("the booked seat "+seat);
			System.out.println("current avalible seat "+totalSeat);
		}
		else {
			System.out.println("the given seat is "+seat);
			
			System.out.println("seat is not avalible ");
		}
	}
	
	public static void main(String[] args) {
		threatreScreen t = new threatreScreen();
		t.bookticket(10);
		threatreScreen t1 = new threatreScreen();
		t1.bookticket(5);
		
	}
}
