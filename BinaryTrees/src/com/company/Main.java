package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        BinaryTreeADT<Integer> binaryTreeADT = new BinaryTreeADT<Integer>();
        binaryTreeADT.add(50);
        binaryTreeADT.add(20);
        binaryTreeADT.add(30);
        binaryTreeADT.add(60);
        binaryTreeADT.add(100);
        binaryTreeADT.add(40);
        binaryTreeADT.add(35);
        binaryTreeADT.add(10);



        System.out.println(" Inorder Traversal ");
        List<Integer> inOrderList = new ArrayList<Integer>();
        binaryTreeADT.traverseInOrder(binaryTreeADT.getRoot(), inOrderList);
        binaryTreeADT.printList(inOrderList);
        System.out.println(binaryTreeADT.isEmpty(inOrderList));
        System.out.println(binaryTreeADT.size);
        System.out.println("Root node is " + binaryTreeADT.getRoot().data);
        binaryTreeADT.printList(inOrderList);
        System.out.println(binaryTreeADT.contains(60));


        System.out.println(" Pre Traversal ");
        List<Integer> preOrderList = new ArrayList<Integer>();
        binaryTreeADT.traversePreOrder(binaryTreeADT.getRoot(), preOrderList);
        binaryTreeADT.printList(preOrderList);


        System.out.println(" Post Traversal ");
        List<Integer> postOrderList = new ArrayList<Integer>();
        binaryTreeADT.traversePostOrder(binaryTreeADT.getRoot(), postOrderList);
        binaryTreeADT.printList(postOrderList);


    }
}
