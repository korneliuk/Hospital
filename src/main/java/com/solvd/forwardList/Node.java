package com.solvd.forwardList;

/**
 * Node helper class for ForwardList.
 * It consists of templated variable for store different data types
 * and reference to the next node.
 *
 * @param <T> The template for substituting different data types.
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

