package handson6.Question5;

/**
 * Demonstrates abstraction and runtime polymorphism.
 */
public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(10.0);

        Shape rectangle = new Rectangle(20, 35);
        Shape sphere = new Sphere(15);
        Shape cylinder = new Cylinder(10, 30);

        System.out.println("Rectangle paint required: " + paint.amount(rectangle));
        System.out.println("Sphere paint required: " + paint.amount(sphere));
        System.out.println("Cylinder paint required: " + paint.amount(cylinder));
    }
}
