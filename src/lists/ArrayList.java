package lists;

public class ArrayList<E> {
    
    private int size;
    
    private Object[] array;
    
    public ArrayList() {
        size = 0;
        array = new Object[10];
    }
    
    private void resize(int newsize) {
        Object[] newArray = new Object[newsize];
        
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        
        array = newArray;
    }
    
    public void add(E item) {
        if (array.length >= size) {
            resize(array.length * 2);
        }
        
        array[size] = item;
        
        size++;
    }
    
    public void remove(int index) {
        
    }
    
    public void remove(E item) {
        
    }
    
    public E get(int index) {
        return (E) array[index];
    }
    
    public int size() {
        return size;
    }
}
