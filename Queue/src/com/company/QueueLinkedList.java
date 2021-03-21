package com.company;
/**
 * ////////////////////////////////////////////////////
 * ///////          Timothy Dzokoto             ///////
 * ///////          219IT01000029               ///////
 * ///////                                      ///////
 * ////////////////////////////////////////////////////
 */


/**
 * the QueueLinkedList class implements the generic data type
 * @param <T> the generic data
 */
public class QueueLinkedList<T> {


    // create an objects of the node class
    private Node<T> front;                  // front object for deletion
    private Node<T> rear;                   // rear object for insertion

    // constructor initialize front and rear to null
    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    /**
     * isEmpty returns true if the list items are empty
     * @return true of false value
     */
    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    /**
     * enqueue adds data to the list items
     * @param value the value to be added.
     */
    public void enqueue(T value) {
        // create an instance of the node class
        Node node = new Node(value);
        // check if the list is empty
        if (isEmpty()) {
            // assign node to front and rear.
            front = rear = node;
            return;
        }

        // rear references the node created(node)
        rear.next = node;
        // rear is assigned node
        rear = node;
    }

    public T dequeue() {
        // check to seee if the list is empty
        if (isEmpty()){
            System.out.println("empty queue");
        }
        // get the data in front and store in in value
        T value = front.data;
        if (front == rear){
            // assign front and rear to null
            front = null;
            rear = null;
        }

        else
            // traverse to the next item and store it into front
            front = front.next;
        return value;                           // the value deleted from the list
    }

    /**
     * the front method return the first infront of the queue
     * @return the value of the item infront of the queue
     */
    public T front() {
        if (isEmpty()){
            System.out.println("empty queue");
        }

        return front.data;                  // the value of the item infront of the queue
    }


    /**
     * the display method prints the value stored in the
     * individual items
     */
    public void display(){
        // check if front is null
        if(front == null){
            System.out.println("queue empty");
        }
        // create a new node and assign front to it
        Node node = front;
        // traverse through individual list items while displaying their content
        while(node != null){
            System.out.printf(node.data + " <== ");
            node = node.next;                       // get the next node item and store it in node
        }
        System.out.println();
    }

}
