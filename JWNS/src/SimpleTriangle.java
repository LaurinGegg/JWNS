package JWNS.src;
import java.awt.Color;
public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle(Vertex pos, double width, Color color) {
        super(pos, width, Math.sqrt(3) / 2*width, new Color(0,0,0));
    }

    public double area() {
        return 0.5 * width * height;
    }

    public double circusference() {
        return 3 * width;
    }

    public String toString() {
        return "SimpleTriangle:" + super.toString();
    }
}