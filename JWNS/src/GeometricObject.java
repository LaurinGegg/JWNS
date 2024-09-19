package JWNS.src;

public class GeometricObject {

    public Vertex pos;
    public double width;
    public double height;

    public GeometricObject(Vertex pos, double width, double height) {
        this.pos = pos;

        if (width < 0) {
            this.width = Math.abs(width);
            this.pos.x = this.pos.x - this.width;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = Math.abs(height);
            this.pos.y = this.pos.y - this.height;
        } else {
            this.height = height;

        }

        this.width = width;
        this.height = height;

    }

}