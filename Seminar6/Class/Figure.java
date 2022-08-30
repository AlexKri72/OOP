package Seminar6.Class;

/**
 * Описываем фигуру
 */
public abstract class Figure implements Square {
    protected String figureName;
    protected double square;

    public Figure(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }

    public double getSquare() {
        return square;
    }
}