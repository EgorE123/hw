import java.awt.*;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract double getArea(); // абстрактый метод

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "shape in" + color.toString() + "color";
    }
}
