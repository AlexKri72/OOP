package Seminar6.Class;

/**
 * Напишите программу для поставки внешним клиентам, которая умеет вычислять
 * площадь круга по радиусу, прямоугольника по двум сторонам и других фигур
 * Дополнительно к работоспособности оценим:
 *
 * легкость добавления других фигур
 * вычисление площади фигуры без знания типа фигуры
 * обработку возникающих проблем при создании фигур
 * Применение принципов SOLID
 */
public class App {
    public static void main(String[] args) {
        DataBaseOfFigures<Figure> allFigures = new DataBaseOfFigures<>();
        Figure figure1 = new Circle("circle", 4);
        Figure figure2 = new Rectangle("rectangle", 3, 6);
        allFigures.addLast(figure1);
        allFigures.addLast(figure2);

        for (Figure figure : allFigures) {
            figure.square();
            System.out.println(figure.square);
        }
    }
}