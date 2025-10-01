public class MainDecorator {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle without decorator:");
        circle.draw();

        System.out.println("\nCircle with Red Border:");
        redCircle.draw();

        System.out.println("\nRectangle with Red Border:");
        redRectangle.draw();
    }
}