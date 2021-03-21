package com.company;

import java.util.Scanner;


/**
 * ////////////////////////////////////////////////////
 * ///////          Timothy Dzokoto             ///////
 * ///////          219IT01000029               ///////
 * ///////                                      ///////
 * ////////////////////////////////////////////////////
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");

        queue.display();

        System.out.println("=================dequeue=================");
        queue.dequeue();
        queue.display();

        String ss;
        do{
            queue.dequeue();
            queue.display();
            System.out.println("Press [D] to delete a node or [Q] to quit");
            Scanner key = new Scanner(System.in);
            ss = key.nextLine();
        }while(ss.equalsIgnoreCase("D"));
    }
}
