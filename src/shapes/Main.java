package shapes;

public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeAdapter();

        drawer.drawCircle();   // Drawing a Circle (Old way)
        drawer.drawSquare();   // Drawing a Square (Old way)
        drawer.drawTriangle(); // Drawing a Triangle (New way)
        drawer.drawEllipse();  // Drawing an Ellipse (New way)
    }
}
