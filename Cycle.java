import java.awt.*;

public class Cycle extends Shape {
    private final double radius;

    public Cycle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
