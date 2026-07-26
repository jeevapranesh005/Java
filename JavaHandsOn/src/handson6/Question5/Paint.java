package handson6.Question5;

/**
 * Paint class calculates required paint amount for shapes.
 */
public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape) {
        return shape.area() / coverage;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}
