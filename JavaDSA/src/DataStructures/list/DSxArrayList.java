package DataStructures.list;

import java.util.Arrays;

public class DSxArrayList<T> {

    private static final int RESIZE_FACTOR = 2;
    public final float LOAD_FACTOR = 1;

    private int capacity;
    private int size;
    private T[] array;

    public DSxArrayList() {
        this(10);
    }

    public DSxArrayList(int capacity) {
        if (capacity == 0) {
            capacity = 10;
        }

        array = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        // check if the array is almost full
        if (size >= capacity * LOAD_FACTOR) {
            resizeArray();
        }
        array[size++] = element;
    }

    /**
     * Create new array of larger length and copy contents to new Array
     */
    private void resizeArray() {
        int newCapacity = capacity * RESIZE_FACTOR;
        array = Arrays.copyOf(array, newCapacity);
        capacity = newCapacity;
    }

    @Override
    public String toString() {
        T[] printArray = Arrays.copyOf(array, size);
        return Arrays.toString(printArray);
    }
}
