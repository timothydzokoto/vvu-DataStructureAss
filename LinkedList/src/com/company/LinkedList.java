package com.company;

public class LinkedList<T> {

    // Create an object head of the node class
    Node head = null;

    public void insertAtLast(T data) {
        // Create an instance of the node class
        // as new node to insert
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        // Check if there is no node in the LinkedList
        // if there is no node then the newNode becomes the head.
        if (head == null) {
            head = newNode;
        } else {
            // there is a head therefore use the head element to
            // get the next item in the list that has no references to a node
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    // insertAtFirst method insert an element at the begining
    // of the LinkedList therefore making the that element the head
    public void insertAtFirst(T data) {
        // Create an instance of the node class
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.next = head;
        head = newNode;
    }

    // insertAt method insert at a given position
    // the position is determine by the parameter variable
    public void insertAt(int index, T data) {
        // Create an instance of the node class
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        // Check if the index to insert is zero
        // if zero make that node the head.
        if (index == 0) {
            insertAtFirst(data);
        } else {
            // Create a head and traverse element in the list
            // to required position to insert
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            // the newNode point to the current node's next item
            // and the current node now points to the newNode.
            newNode.next = node.next;
            node.next = newNode;
        }

    }

    // The deleteIndex method deletes an element from the list
    // by the elements position in the list
    public void deleteIndex(int index) {

        // the first element is to be deleted assigned head
        // to the next element after it
        if (index == 0) {
            head = head.next;
        } else {
            // create an instance of the Node class to be
            // starting node
            Node node = head;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            // store the node to be deleted in tempt variable
            temp = node.next;       // temp references the node.next item
            node.next = temp.next;  // node,next now references the temp.next item
            System.out.println("Deleted value " + temp.data);
        }
    }





    // Recursive method of deleting LinkedList
    // It takes a node (head)  and data as argument

    /**
     * The deleteRecursively method deletes nodes
     * @param head the head node
     * @param data the data to be deleted
     * @return the node deleted
     */
    private Node deleteRecursive(Node head, T data) {
        // Return null if no item exist
        if (head == null) {
            return null;
        }
        Node cont = deleteRecursive(head.next, data);
        if (head.data != data) {
            head.next = cont;
            return head;
        }

        head = null;
        return cont;
    }

    // the show method displays the LinkedList items on the screen
    public void show() {
        // Create a head node
        Node node = head;

        // Loop through the LinkedList and display all elements without
        // null reference
        while (node.next != null) {
            System.out.println("* Node Data : " + node.data);
            node = node.next;
        }
        // Print the last element with
        System.out.println("* Node Data : " + node.data);
        System.out.println("\n");
    }

}
