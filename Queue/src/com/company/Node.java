package com.company;

/**
 * ////////////////////////////////////////////////////
 * ///////          Timothy Dzokoto             ///////
 * ///////          219IT01000029               ///////
 * ///////                                      ///////
 * ////////////////////////////////////////////////////
 */


public class Node<T> {
    T data;
    Node<T> next;

    // Constructor
    public Node(T data) {
        this.data = data;
    }
}
