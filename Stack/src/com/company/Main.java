package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // create Object of Implementing class
        StackLinkedList<String> obj = new StackLinkedList<String>();
        // insert Stack value
        obj.push("Red");
        obj.push("Yello");
        obj.push("Green");
        obj.push("black");

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.println("\nTop element is " + obj.peek());
        System.out.println("========= After deleting =============\n\n");
        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();



        // print Top element of Stack
        System.out.printf("\nTop element is " + obj.peek());
    }
}
