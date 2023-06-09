package DataStructures.list;

import java.util.Arrays;

public class DSxArrayList {

    public final int RESIZE_FACTOR = 2;
    public final float LOAD_FACTOR = 0.75F;

    int size;
    int capacity;
    Object[] array;

    public DSxArrayList(int initialCapacity) {
        this.capacity = initialCapacity;
        array = new Object[initialCapacity];
    }

    public Object add(Object element) {
        if(size >= capacity * LOAD_FACTOR) {
            resizeArray();
        }
        array[size] = element;
        return array[size++];
    }

    private void resizeArray() {
        int newCapacity = capacity * RESIZE_FACTOR;
        array = Arrays.copyOf(array, newCapacity);
    }

    @Override
    public String toString() {
        return String.valueOf(Arrays.asList(array));
    }
}
