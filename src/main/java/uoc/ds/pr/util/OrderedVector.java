package uoc.ds.pr.util;

import edu.uoc.ds.traversal.Iterator;
import java.util.Comparator;

public class OrderedVector<T> {
    private T[] elements; // El arreglo que contiene los elementos
    private int size;     // El número actual de elementos en el arreglo
    private final Comparator<T> comparator; // El comparador para mantener el orden

    @SuppressWarnings("unchecked")
    public OrderedVector(int capacity, Comparator<T> comparator) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
        this.comparator = comparator;
    }

    public void update(T element) {
        if (size == elements.length) {
            if (comparator.compare(elements[size - 1], element) > 0) {
                elements[size - 1] = element;
                sort();
            }
        } else {
            elements[size++] = element;
            sort();
        }
    }

    private void sort() {
        // Implementación simple usando bubble sort para fines educativos
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < size; i++) {
                if (comparator.compare(elements[i - 1], elements[i]) < 0) {
                    T temp = elements[i - 1];
                    elements[i - 1] = elements[i];
                    elements[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public void delete(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                size--;
                break;
            }
        }
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int size() {
        return size;
    }

    public Iterator<T> values() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return elements[currentIndex++];
            }
        };
    }










}
