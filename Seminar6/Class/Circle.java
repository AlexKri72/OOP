package Seminar6.Class;

/**
 * Описываем фигуру круг
 */
public class Circle extends Figure {
    private int radius;

    public Circle(String figureName, int radius) {
        super(figureName);
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println("circle");
        square = Math.PI * radius * radius;
    }
}