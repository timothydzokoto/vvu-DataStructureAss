package com.company;

import java.util.List;

// Extend comparable to enable objects or string comparison.
public class BinaryTreeADT<T extends Comparable<T>> {
    private Node root;
    int size = 0;

    public Node<T> getRoot() {
        return this.root;
    }

    // the add method add a node to the list
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> tempNode = root;
            Node<T> prev = null;
            while (tempNode != null) {
                prev = tempNode;
                if (data.compareTo(tempNode.data) > 0) {
                    tempNode = tempNode.right;
                } else {
                    tempNode = tempNode.left;
                }
            }
            if (data.compareTo(prev.data) < 0) {
                prev.left = newNode;
            } else {
                prev.right = newNode;
            }

        }

        size++;         // increase size
    }

    // isEmpty determine if the list is has no node
    public boolean isEmpty(List<T> treeData) {
        return treeData == null;
    }

    // the method returns the size of the nodes in the list
    public int size() {
        return size;
    }

    // the overloaded size method returns the size of nodes form a given node
    private int size(Node<T> root) {
        // return null if no item exist
        if (root == null) {
            return 0;
        } else {
            // return the size of left nodes, right nodes and the given node
            return (size(root.left)) + (size(root.right) + 1);
        }
    }


    // the contain method determines if the list has a specific item
    public boolean contains(T data) {
        if (data == null)
            return false;

        Node curr = root;
        // traverse the list
        while (curr != null) {
            int cmp = data.compareTo((T) curr.data);

            // take the left direction of the tree
            if (cmp < 0) {
                curr = curr.left;
            }
            else if (cmp > 0) {
                // take the right direction of the tree
                curr = curr.right;
            }
            else {
                // item found in the list
                return true;
            }
        }

        // item not found in the list
        return false;
    }


    // ------------------------------------------------------------------------------
    public boolean remove(T data) {
        if (null == data)
            return false;

        Node parent = null;
        Node curr = root;
        while (curr != null ) {
            int cmp = data.compareTo((T) curr.data);
            if (cmp < 0) {
                parent = curr;
                curr = curr.left;
            }
            else if (cmp > 0) {
                parent = curr;
                curr = curr.right;
            }
            else {
                break;
            }
        }

        if (curr == null)
            return false;

        if (curr.left == null) {
            if (parent == null) {
                root = curr.right;
            }
            else {
                if (0 > data.compareTo((T) parent.data)) {
                    parent.left = curr.right;
                }
                else {
                    parent.right = curr.right;
                }
            }
        }
        else {
            Node parentRight = curr;
            Node mostRight = curr.left;
            while (null != mostRight.right) {
                parentRight = mostRight;
                mostRight = mostRight.right;
            }

            curr.data = mostRight.data;
            if (parentRight.right.equals(mostRight)) {
                parentRight.right = mostRight.left;
            }
            else {
                parentRight.left = mostRight.left;
            }
        }

        --size;
        return true;
    }






    // ===============================================================================


    public void traverseInOrder(Node<T> root, List<T> treeData) {
        if (root != null) {
            traverseInOrder(root.left, treeData);
            treeData.add(root.data);
            traverseInOrder(root.right, treeData);
        }
    }

    public void traversePreOrder(Node<T> root, List<T> treeData) {
        if (root != null) {
            treeData.add(root.data);
            traversePreOrder(root.left, treeData);
            traversePreOrder(root.right, treeData);
        }
    }

    public void traversePostOrder(Node<T> root, List<T> treeData) {
        if (root != null) {
            traversePostOrder(root.left, treeData);
            traversePostOrder(root.right, treeData);
            treeData.add(root.data);
        }
    }

    public void printList(List<T> list) {
        for (T item : list) {
            System.out.printf(item + "\t");
        }
    }



}
