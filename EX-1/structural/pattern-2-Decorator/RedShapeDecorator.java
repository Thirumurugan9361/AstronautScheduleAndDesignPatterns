public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }
    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}