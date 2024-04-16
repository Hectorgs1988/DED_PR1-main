package uoc.ds.pr.util;

public class FiniteLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    private final int capacity;

    public FiniteLinkedList(int capacity) {
        this.capacity = capacity;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void insertEnd(T data) {
        if (size < capacity) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public int length() {
        return capacity;
    }


}
