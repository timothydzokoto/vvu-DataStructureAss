package com.company;

public class DoublyLinkedList {
    private DLink head;         // an object of the DLink class
    private int size;           // variable to hold the size of elements in the list

    // Constructor
    public DoublyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    /**
     * The insertAtFirst method insert data at the start of the list items
     * @param data the data to be stored in the list items
     */
    public void insertAtFirst(String data){
        // if head is null the new node becomes the head
        if(head == null ){
            head = new DLink(null, data, null);
        }
        else{
            // create a new node which references the head node by passing
            // head node as it's next node items
            DLink newLink = new DLink(null, data, head);
            head.previous = newLink;        // head node's prev becomes the new node created(newLink)
            head = newLink;                 // new node(newLinke) becomes the head.
        }
        size++;                             // increase size since items is added to the list
    }


    /**
     * the deleteFirst method delete item at the beginning of the node
     */
    public void deleteFirst(){
        // do nothing if head in null
        if(head == null){
            return;
        }

        head = head.next;           // change the head to item next to head node
        head.previous = null;       // head.previous references null
        size--;                     // decrease size since an item is removed from list

    }

    /**
     * the insertAtLast method insert data at the end of the list
     * @param data the data to be inserted into the list
     */
    public void insertAtLast(String data){
        // if head is null the new node becomes the head
        if(head == null){
            head = new DLink(null, data, null);
        }
        else{
            // create a node and assign head node to it
            DLink currentLink = head;
            // Traverse to the last node in the list
            while(currentLink.next != null){
                currentLink = currentLink.next;
            }
            // create a new node with it's previous pointing to currentLink item
            DLink newLink = new DLink(currentLink, data, null);
            currentLink.next = newLink;             // currentLink points to the new node created(newLink)
        }
        size++;             // increase size since there has been an addition to the list items
    }


    public void deleteLast(){
        // do nothing if the list is empty
        if(head == null){
            return;
        }
        // delete head if list items contains only head node
        // and decrease list items by one
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        // create a node and assign head node to it
        DLink currentLink = head;
        // Traverse to the last node in the list
        // with selection on the second to last item
        while(currentLink.next.next != null){
            currentLink = currentLink.next;
        }
        // delete by setting reference of currentLink to null
        currentLink.next = null;
        size--;         // decrease size
    }


    /**
     * the insertAt method insert data at a desired position
     * @param data              // the data to be inserted
     * @param index             // the position to insert data
     */
    public void insertAt(String data, int index){
        // do nothing if head is null
        if(head == null){
            return;
        }
        // do nothing if position is less than one
        if(index < 1 || index > size){
            return;
        }

        // Create a node and assign head to it
        DLink currentLink = head;
        int i = 1;
        // Traverse to the required position.
        while(i < index){
            currentLink = currentLink.next;
            i++;
        }
        // inserting at the first position
        if(currentLink.previous == null){
            DLink newLink = new DLink(null, data, currentLink);
            currentLink.previous = newLink;
            head = newLink;
        }
        else{
            // create a new node with
            DLink newLink = new DLink(currentLink.previous, data, currentLink);
            currentLink.previous.next = newLink;            // newLink is referenced by currentLink's previous item
            currentLink.previous = newLink;                 // newLink becomes currentLink previous item
        }
        size++;
    }


    /**
     * the deleteAt method delete item at a specified index.
     * @param index the index to delete at.
     */
    public void deleteAt( int index){
        // do nothing when head is null
        if(head == null){
            return;
        }
        // do nothing when the specified position is less than one
        if(index < 1 || index > size){
            return;
        }
        // create a new node and assign head to it.
        DLink currentLink = head;
        int i = 1;
        // Traverse to the required position.
        while(i < index){
            currentLink = currentLink.next;
            i++;
        }
        // when the node to delete is at last positioned node
        if(currentLink.next == null){
            currentLink.previous.next = null;
        }
        // when deletion is at the first item(head node)
        else if(currentLink.previous == null){
            currentLink = currentLink.next;         // traverse to the next item from currentLink
            currentLink.previous = null;            // the current item's previous reference part point to null
            head = currentLink;                     // currentLink becomes the head.
        }
        else{
            currentLink.previous.next = currentLink.next;           // the node before currentLink references currentLink.next item
            currentLink.next.previous = currentLink.previous;       // the node after currentLink previous part references
                                                                    // the currentLink.previous item.
        }
        size--;
    }



    /**
     * The display method loop through the list and displays
     * if there exit items in list
     */
    public void display(){

        DLink currentLink = head;
        // Traverse through the node items
        while(currentLink != null){
            System.out.println(currentLink.data());
            currentLink = currentLink.next;
            // System.out.println("size is " +size);
            System.out.println("\t||");
            System.out.println("\t||");
            System.out.println("\t\\/");
        }
    }

}