package DataStructures.list;

import java.util.Arrays;

public class DSxArraylist2 {

    private static final int CAPACITY_FACTOR = 2;
    private int capacity;
    private int size;
    private Object[] array;

    public DSxArraylist2() {
        this(10);
    }

    public DSxArraylist2(int capacity) {
        if (capacity == 0) {
            capacity = 10;
        }

        array = new Object[capacity];
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
        // if the array is almost full
        if (size >= capacity) {
            resizeArray();
        }
        array[size] = element;
        size++;
    }

    private void resizeArrayManually() {
        int newCapacity = 2 * capacity;
        // create new Array of twice the capacity
        Object[] newArray = new Object[newCapacity];
        // copy elements from old array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    private void resizeArray() {
        int newCapacity = capacity * CAPACITY_FACTOR;
        array = Arrays.copyOf(array, newCapacity);
        capacity = newCapacity;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
