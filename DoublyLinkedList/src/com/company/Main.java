package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtLast("Dzokoto I");
        dll.insertAtLast("Agbo Dzokoto");
        dll.insertAtLast("Yaw Dzokoto");
        dll.insertAtLast("Timothy Dzokoto");
        dll.insertAt("Mom", 3);
        dll.display();
        System.out.println("==============================");
        // dll.deleteAt(2);
        dll.display();

    }
}
