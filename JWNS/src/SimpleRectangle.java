package JWNS.src;
import java.awt.Color;
public class SimpleRectangle extends GeometricObject {
    public SimpleRectangle(Vertex pos, double width, double height,Color color) {
        super(pos, width, height, new Color(0,0,0));
    }

    public String toString() {
        return "SimpleRectangle:" + super.toString();
    }
}
