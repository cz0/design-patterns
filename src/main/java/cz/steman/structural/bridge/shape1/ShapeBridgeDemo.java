package cz.steman.structural.bridge.shape1;

public class ShapeBridgeDemo {
    public static void main(String[] args) {
        Circle redCircle = new RedCircle();
        Square redSquare = new RedSquare();
        Square greenSquare = new GreenSquare();

        redCircle.applyColor();
        redSquare.applyColor();
        greenSquare.applyColor();
    }
}
