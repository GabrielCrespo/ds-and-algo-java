package datastructures.dynamicarray;

public class DynamicArray<T> {

    // is the number of elements that the array can hold by default
    private static final int DEFAULT_CAPACITY = 16;
    // will store the elements of the array
    private T[] array;
    // is the number of elements currently present in the array
    private int size;
    // is the number of elements that the array can hold
    private int capacity;

    public DynamicArray() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public void push(T value) {
        if(size == capacity) {
            resize();
        }

        array[size] = value;
        size++;
    }

    public void insert(int index, T value) {
        if(size == capacity) {
            resize();
        }

        for(int i = size; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = value;
        size++;

    }

    public T pop() {

        T value = array[size-1];
        array[size-1] = null;
        size--;

        return value;
    }

    public void delete(int index) {
        for(int i = index; i < size - 1; i++) {
            array[i] = array[i+1];
        }

        if(size == index) {
            array[index] = null;
        } else {
            array[size - 1] = null;
        }

        size--;
    }

    public int find(T value) {
        for(int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return  i;
            }
        }

        return -1;
    }

    private void resize() {

        T[] newArray = (T[]) new Object[capacity * 2];

        for(int i = 0; i < capacity; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity *= 2;
    }

    @Override
    public String toString() {
        String string = "";

        for(int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }

        if(string != "") {
            string = "[" + string.substring(0, string.length()-2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }
}
