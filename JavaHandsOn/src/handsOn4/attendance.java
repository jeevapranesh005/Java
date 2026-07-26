package handsOn4;

import java.time.LocalTime;

public class attendance {
	
		private int id;
		private LocalTime checkIntime;
		private LocalTime checkouttime;
		private boolean isin=false;
		private boolean isout=false;
		public  attendance(int id) {
			this.id=id;
		}
		public void markcheckin() {
			if(!isin) {
				checkIntime=LocalTime.now();
				isin=true;
				System.out.println("The employee has checked in : "+checkIntime);
			}else {
				System.out.println("The employee has already in");
			}
		}
		public void checkout() {
			if(!isin) {
				System.out.println("The employee should checked in first");
			}else if(isout){
				System.out.println("The employee is already out");
			}else {
				isout=true;
				System.out.println("The employee is checked out ");
			}
		}
		public void getdetails() {
			System.out.println("Id : "+id);
			System.out.println("Check in time "+checkIntime);
			System.out.println("Check out time "+checkouttime);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
