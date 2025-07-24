package com.solvd.forwardList;

import java.util.Iterator;

/**
 * Class that implements single linked-list logic and can store different data types.
 * It consists of nodes. Each node knows memory placement of the next node.
 * For access to the first node, class has reference called head.
 * <p>
 * For successful access to the elements, you can use method at(int index).
 * For successful iteration through the array, you can use for, for-each loops
 * or combination of implemented input iterator and while loop.
 *
 * @param <T> The template for substituting different data types.
 */
public class ForwardList<T> implements Iterable<T> {
    private Node<T> head;
    private int size = 0;

    public ForwardList() {
        head = null;
    }

    public ForwardList(ForwardList<T> other) {
        for (T value : other)
            pushBack(value);
    }

    public ForwardList(T[] array) {
        for (T value : array)
            pushBack(value);
    }

    public int getSize() {
        return size;
    }

    private final INullable nullable = (node) -> {
        return node == null;
    };

    public void pushBack(T value) {
        Node<T> newNode = new Node<>(value);
        if (nullable.isNull(head)) {
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.getNext() != null)
                current = current.getNext();

            current.setNext(newNode);
        }
        ++size;
    }

    public void pushFront(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
        ++size;
    }

    public void popFront() {
        if (!nullable.isNull(head)) {
            head = head.getNext();
            --size;
        }
    }

    public void popBack() {
        if (!nullable.isNull(head)) {
            Node<T> current = head;

            while (current.getNext().getNext() != null)
                current = current.getNext();

            current.setNext(null);
            --size;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void insert(int index, T value) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index out of bounds.");

        if (index == 0)
            pushFront(value);
        else if (index == size)
            pushBack(value);
        else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; ++i)
                current = current.getNext();

            Node<T> next = current.getNext();
            Node<T> newNode = new Node<>(value);

            newNode.setNext(next);
            current.setNext(newNode);
            ++size;
        }
    }

    public void set(int index, T value) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index out of bounds.");

        Node<T> current = head;

        for (int i = 0; i < index; ++i)
            current = current.getNext();

        current.setValue(value);
    }

    public T at(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds.");

        Node<T> current = head;

        for (int i = 0; i < index; ++i)
            current = current.getNext();

        return current.getValue();
    }

    public void removeAt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index out of bounds.");

        if (index == 0)
            popFront();
        else if (index == size)
            popBack();
        else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; ++i)
                current = current.getNext();

            current.setNext(current.getNext().getNext());
            --size;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.getValue();
                current = current.getNext();
                return value;
            }
        };
    }

    public boolean equals(ForwardList<T> other) {
        if (this.size != other.size)
            return false;

        Iterator<T> thisIterator = this.iterator();
        Iterator<T> otherIterator = other.iterator();

        while (thisIterator.hasNext()) {
            if (!thisIterator.next().equals(otherIterator.next()))
                return false;
        }

        return true;
    }

    public boolean empty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<T> current = head;
        while (current.getNext() != null) {
            result.append(current.getValue()).append(", ");
            current = current.getNext();
        }

        if (!nullable.isNull(head))
            result.append(current.getValue());

        result.append("]");

        return result.toString();
    }
}