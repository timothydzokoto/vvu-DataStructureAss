package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        LinkedList list = new LinkedList();
        list.insertAtFirst(8);
        list.insertAtLast(10);
        list.insertAtLast(12);
        list.insertAtLast(16);
        list.insertAtLast(9);
        list.insertAtLast(14);

        System.out.println("Showing exiting values.\n");
        list.show();

        // 1. insert 15 infront
        list.insertAtFirst(15);
        System.out.println("Value 15 Infront");
        list.show();

        // 2. insert 25 after value 16
        list.insertAt(5, 25);
        System.out.println("Insert 25 At position 5");
        list.show();

        // // 3. delete 9 recursively
        // list.deleteRecursive(head, 9);
        // System.out.println("Value 9 Recursively deleted");
        // list.show();

        // 4. insert 30 after value 10
        list.insertAt(3, 30);
        System.out.println("Insert 30 after value 10");
        list.show();

        // 5 insert 45 at the end
        list.insertAtLast(45);
        System.out.println("Insert 45 at end.");
        list.show();

        // 6. delete iteratively 8 after 15
        list.deleteIndex(1);
        System.out.println("Delete 8 iteratively after value 15");

        list.show();

        run();


    }


    public static void userInteraction() {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int num;
        System.out.println("Enter the appropriate chioce to run the program.");
        System.out.println("Enter :"
                + "\n1. Insert at Strart :"
                + "\n2. Insert at End "
                + "\n3. Insert Iteratively at a required position"
                + "\n4. Delete at a required position"
                + "\n5. Delete Recursively");

        num = input.nextInt();
        int pos, data;


        switch (num)
        {
            case 1:
                System.out.println("Enter data to ");
                data = input.nextInt();
                ls.insertAtFirst(data);
                ls.show();
                break;
            case 2:
                System.out.println("Enter data to ");
                data = input.nextInt();
                ls.insertAtLast(data);
                ls.show();
                break;
            case 3:
                System.out.println("Enter data to ");
                data = input.nextInt();
                System.out.println("Enter position to insert ");
                pos = input.nextInt();
                ls.insertAt(pos, data);
                ls.show();
                break;
            case 4:
                System.out.println("Enter position to insert ");
                pos = input.nextInt();
                ls.deleteIndex(pos);
                ls.show();
                break;
            case 5:
                // System.out.println("Enter data to ");
                // data = input.nextInt();
                // ls.deleteRecursive(head, data);
                // ls.show();
                // break;

        }

    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        String option = "y";
        char choice = option.toLowerCase().charAt(0);

        while (choice == 'y' || choice  == 'Y') {
            userInteraction();

            System.out.println("\n\n\nDo you want to run again ? ");
            option = in.nextLine();
            choice = option.toLowerCase().charAt(0);
        }
    }
}
