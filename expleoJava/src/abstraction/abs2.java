package abstraction;

//shape
abstract class shape{
	
	public void draw() {
		System.out.println("drawing...");
	}
	
	public abstract void area();
	public abstract void parameter();
}


 class rectangle extends shape{
	 int length ;
		int breadth ;
		
		

		public rectangle(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
		}

		public void area() {
			System.out.println("Area = " + (length * breadth));
		}

		public void parameter() {
			System.out.println("Perimeter = " + (2 * (length + breadth)));
		}
	
}
 
 class square extends shape{
	 int side;

	 public square(int side) {
		this.side = side;
	 }
	 
	 public void area() {
		 System.out.println("Area = "+ side*side);
	 }
	 public void parameter() {
		 System.out.println("paremeter "+(4*side));
	 }
	 
 }

 
 class circle extends shape {
	 double radius;
	 final double PI= 3.14;
	 
	 circle(double radius){
		 this.radius=radius;
	 }
	 
	 public void area () {
		 System.out.println("Area "+(PI*radius*radius));
	 }
	 
	 public void parameter() {
		 System.out.println("parameter "+(2*PI*radius));
	 }
	 
 }

public class abs2 {
	public static void main(String[] args) {
		//method 1
		circle ci = new circle(5);
		rectangle rect = new rectangle(3,5);
		square sq = new square(4);
		ci.area();
		
		//method 2
		shape s;
		s=new rectangle(5,5);
		s.area();
	}
}