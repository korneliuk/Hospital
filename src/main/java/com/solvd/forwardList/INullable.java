package com.solvd.forwardList;

@FunctionalInterface
public interface INullable<T> {
    boolean isNull(Node<T> node);
}
