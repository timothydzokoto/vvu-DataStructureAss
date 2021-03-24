package com.company;

public class StackLinkedList<T> {

    // create an object of the node class
    // initialize to null
    private Node<T> top = null;
    int items = 0;

    // isEmpty returns a boolean value based on a condition
    public boolean isEmpty(){
        return top == null;
    }


    // the peek method returns the item on top of the stack
    public T peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;            // return top data value
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    // the push method add an item to the stack
    public void push(T data){
        // create an instance of the node class
        Node<T> newNode = new Node<T>(data);

        // check if top is null
        // top assigned new node
        // items increase
        if(top == null){
            top = newNode;
            items++;
        }
        else{
            newNode.data = data;
            newNode.next = top;
            top = newNode;
            items++;
        }
    }

    // the pop method deletes an item form the stack
    // the deleted item is returned.
    public T pop(){
        // check for stack if it empty (underflow)
        if (top == null) {
            System.out.print("\nStack Empty");
            return null;
        }
        // create a variable to hold the top data
        T popItem = top.data;
        // traverse to the next item in the list
        top = top.next;
        items--;                    // decrease items in the list

        return popItem;             // return the deleted item

    }

    /**
     * the getItems method return the number of list items
     * @return the number of items in the stack.
     */
    public int getItems(){
        return items;
    }

    // the display method displays the item in the  list
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Empty");
            return;
        }
        else {
            // create a node and assign top to it
            Node<T> items = top;
            // traverse through the items while displaying their data
            while (items != null) {

                // print node data
                System.out.println("\n");
                System.out.printf("*******%10S********\n","==========");
                System.out.printf("*******" + items.data + "==========\n");
                System.out.printf("*******%10S********\n","==========");
                System.out.println("\n");

                items = items.next;
            }
        }
    }
}

