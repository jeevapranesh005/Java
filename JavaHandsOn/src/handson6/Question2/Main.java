package handson6.Question2;

/**
 * Main class for Question 2.
 */
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3, 1, 1);
        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 4);

        System.out.println("Initial point: " + point);
        point.moveRight();
        point.moveDown();
        System.out.println("After moving point: " + point);

        System.out.println("Initial circle: " + circle);
        circle.moveLeft();
        circle.moveUp();
        System.out.println("After moving circle: " + circle);
    }
}
