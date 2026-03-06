package abstraction;

interface shape1{
	double default_num = 1.0;
	double area();
	double parameter();
	default String getDesprtion() {
		return "A shape with unspecified dimensions.";
	}
}

abstract class circle1 implements shape1{
	double radius;
	
	
	circle1(double radius){
		this.radius=radius;
	}
	circle1(){
		this.radius=default_num;
	}
	
	public double parameter() {
		return 2*Math.PI*radius;
	}
	
	public  String getDesprtion() {
		return "A circle radius "+radius;
	}
	
}


class rectangle1 implements shape1{
	private double length;
	private double breath;
	
	rectangle1(){
		this.breath=default_num;
		this.length= default_num;
	}
	rectangle1(double length,double breath){
		this.breath=breath;
		this.length= length;
	}
	
	public double area() {
		return length*breath;
	}
	
	public double parameter() {
		return 2*length+breath;
	}
	
	public  String getDesprtion() {
		return "rectangle details. "+length+" "+breath ;
	}
}
public class abs3 {
	public static void main(String[] args) {
		shape1 s;
		
		
		s=new rectangle1(3,4);
		System.out.println(s.area());
		
		circle1 ci = new circle1(5);
	}
}
