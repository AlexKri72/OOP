package Seminar6.Class;

/**
 * Описываем фигуру прямоугольник
 */
public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String figureName, int a, int b) {
        super(figureName);
        this.firstSide = a;
        this.secondSide = b;
    }

    @Override
    public void square() {
        System.out.println("rectangle");
        square = firstSide * secondSide;
    }
}