

public class OurArray<T> implements ArrayInterface<T>{
    private Object[] ourArray;
    private int count;

    
    public Object[] getOurArray() {
        return ourArray;
    }



    public OurArray(int size) {
        this.ourArray = new Object[size];
    }



    @Override
    public void add(T item) {
        ourArray[count] = item;
        count++;  
    }



    @Override
    public T getByIndex(int index) {
        if(index >= count) {
            throw new RuntimeException("Index out of bounds of array");
        }  
        return (T)ourArray[index];
    }

    @Override
    public void removeByIndex(int index) {
        for (int i = index; i < ourArray.length - 1; i++) {
            ourArray[i] = ourArray[i+1];
        }
        count--;
    }

    @Override
    public void removeByElement(T element) {
        for (int i = 0; i < count; i++) {
            if(ourArray[i].equals(element) && !ourArray.equals(null)  ) {
                removeByIndex(i);
            }
        }
    }



    @Override
    public void set(T element, int index) {
        count++; 
        ourArray[count] = ourArray[ourArray.length - 1];
        for (int i = ourArray.length - 1; i > index; i--) {
            ourArray[i] = ourArray[i - 1];
        }
        ourArray[index] = element;
    }

    
    
    



   
}
