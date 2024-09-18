package JWNS.src;

class Vertex {
    public double x;
    public double y;
    public static int i;
    public static int j;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
        j = 999999999;
    }

  

    public double length() {
        return Math.sqrt(x * x + y * y);

    }

    public Vertex skalarMult(double s) {
        return new Vertex(x * s, y * s);
    }

    public void skalarMultMod(double s) {
        x = x * s;
        y = y * s;
    }

    public Vertex add(Vertex v2) {
        return new Vertex(x + v2.x, y + v2.y);

    }

    public void addMod(Vertex v2) {
        x += v2.x;
        y += v2.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }

    public boolean equals(Object thatObject) {
        if (thatObject instanceof Vertex) {
            Vertex that = (Vertex) thatObject;
            return this.x == that.x && this.y == that.y;
        }
        return false;

    }
    public void normalize() {
    double teiler = this.length();
    x = x / teiler;
    y = y / teiler;
}
