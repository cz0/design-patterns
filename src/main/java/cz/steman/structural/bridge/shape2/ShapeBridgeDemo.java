package cz.steman.structural.bridge.shape2;

public class ShapeBridgeDemo {
    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();

        Shape redCircle = new Circle(red);
        Shape redSquare = new Square(red);
        Shape greenSquare = new Square(green);



        redCircle.applyColor();
        redSquare.applyColor();
        greenSquare.applyColor();
    }
}
