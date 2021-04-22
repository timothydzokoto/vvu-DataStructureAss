package com.company;

// Extend comparable to enable objects or string comparison.
public class Node<T extends Comparable<T>> {
    T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data){
        this.data = data;
    }
}