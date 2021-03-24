package com.company;


import java.util.Scanner;


/**
 * ////////////////////////////////////////////////////
 * ///////          Timothy Dzokoto             ///////
 * ///////                                      ///////
 * ///////                                      ///////
 * ////////////////////////////////////////////////////
 */

public class Main<T> {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner(System.in);
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
            System.out.println("Press [A] to add, [D] to delete a node or [Q] to quit");
            Scanner k = new Scanner(System.in);
            ss = key.nextLine();
            while(ss.equalsIgnoreCase("A")){
                System.out.println("Enter what to enter :");
                String str = k.nextLine();
                queue.enqueue(str);
                queue.display();
                System.out.println("Press [A] to add, [D] to delete a node or [Q] to quit");
                ss = key.nextLine();
            }
        }while(ss.equalsIgnoreCase("D"));
    }
}
