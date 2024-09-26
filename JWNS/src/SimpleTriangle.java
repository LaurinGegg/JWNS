package JWNS.src;

public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle(Vertex pos, double width) {
        super(pos, width, Math.sqrt(3) / 2*width);
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