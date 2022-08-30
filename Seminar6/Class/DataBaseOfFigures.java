package Seminar6.Class;

import java.util.Iterator;

/**
 * здесь хранятся все фигуры
 */
public class DataBaseOfFigures<T> implements Iterable<T> {
    private Object[] figures = new Object[10];
    int index = 0;

    public DataBaseOfFigures() {
    }

    public Object[] getFigures() {
        return figures;
    }

    public void addLast(T o) {
        figures[index] = o;
        index++;
    }

    public T takeFirst() {
        T temp = (T) figures[0];
        for (int i = 0; i < index; i++) {
            figures[i] = figures[i + 1];
        }
        return temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return figures[count] != null && count <= index;
            }

            @Override
            public T next() {
                return (T) figures[count++];
            }
        };
    }
}