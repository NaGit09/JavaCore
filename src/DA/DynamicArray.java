package DA;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DynamicArray <T>  implements  Iterable<T>{
    private T[] array;
    private int capacity =0;
    private int size =0;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }
    public int Size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public T get(int index) {
        return array[index];
    }
    public void set(int index, T element) {
        array[index] = element;
    }
    public void clear () {
        Arrays.fill(array, null);
        size = 0;
    }
    public void add(T element) {
        if (size == capacity) {
            capacity = capacity * 2;
            array = Arrays.copyOf(array, capacity);
        }
        array[size++] = element;
    }
    @Override
    public Iterator iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }
    public void remove(T element) {
        int index = indexOf(element);
        if (index != -1) {
            removeAt(index);
        }
    }
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    @Override
    public String toString() {
        if (size == 0) {return "[]";}
        else {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                sb.append(array[i]);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        DynamicArray dn = new DynamicArray(5);
        dn.add(1);
        dn.add(2);
        dn.removeAt(0);
        System.out.println(dn.size);
        dn.remove(2);
        System.out.println(dn.toString());
    }
}
