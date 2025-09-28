package shapes;

public class ShapeAdapter implements ShapeDrawer {
    private OldShapeDrawer oldDrawer;

    public ShapeAdapter() {
        this.oldDrawer = new OldShapeDrawer();
    }
    @Override
    public void drawCircle() {
        oldDrawer.drawCircle(); // используем старую реализацию
    }
    @Override
    public void drawSquare() {
        oldDrawer.drawSquare(); // используем старую реализацию
    }
    @Override
    public void drawTriangle() {
        System.out.println("Drawing a Triangle (New way)");
    }
    @Override
    public void drawEllipse() {
        System.out.println("Drawing an Ellipse (New way)");
    }
}
