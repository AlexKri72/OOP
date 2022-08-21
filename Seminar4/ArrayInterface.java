public interface ArrayInterface<T> {
    public void add(T item);
    public T getByIndex(int index);
    public void removeByIndex(int index);
    public void removeByElement(T element);
    public void set(T element, int index);
}
