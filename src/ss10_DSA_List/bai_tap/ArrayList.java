package ss10_DSA_List.bai_tap;

import java.util.Arrays;

public class ArrayList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] elements;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
    void add(int index, E element) {
        if(index< 0 || index> size)
            throw new IndexOutOfBoundsException();

        ensureCapacity();
        for (int i = size; i > index; i--) elements[i] = elements[i - 1];
        elements[index] = element;
        size++;
    }
    void add(E element){
        ensureCapacity();
        elements[size] = element;
        size++;
    }
    int getSize(){
        return size;
    }
    E get(int index){
        return (E) elements[index];
    }
    int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e))   return i;
        }
        return -1;
    }
}
