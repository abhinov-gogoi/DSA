package DataStructures.list.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class DSxArrayList<T> {

    private static final int RESIZE_FACTOR = 2;
    private static final float LOAD_FACTOR = 1;
    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int size;
    private T[] array;

    public DSxArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public DSxArrayList(int capacity) {
        if (capacity == 0) {
            capacity = DEFAULT_CAPACITY;
        }

        array = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    /**
     * @return size of the array
     */
    public int size() {
        return size;
    }

    /**
     * Add an element to the end of the array
     */
    public void add(T element) {
        // check if the array is almost full
        if (size >= capacity * LOAD_FACTOR) {
            resizeArray();
        }
        array[size++] = element;
    }

    /**
     * @return the element present at the index
     */
    public T get(int index) {
        return array[index];
    }

    /**
     * @return the first element present in the array
     */
    public T first() {
        return array[0];
    }

    /**
     * @return the last element present in the array
     */
    public T last() {
        return array[size];
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
