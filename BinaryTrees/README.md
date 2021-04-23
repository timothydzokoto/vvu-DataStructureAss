




## The following are the methods employed in this binary tree 
- __getRoot__ : with returns the root node of the tree
- __add__ : the add method which takes an argument and adds a new node to the list
- __remove__ : the remove method deletes a specific node from the list depending on the argument passed to its parameters
- __isEmpty__ : the method determines if the list contains an item or not.
- __size__ : the method returns the size of items in the list and/or returns the number of items from a given node.
- __contains__ : the method checks if a specific item exist in the list item.
- __preOrder Traversal__ : the preOrder method do the following: 
    * starts from the root
    * visits each node and then followed by its child nodes from left child to right child.

    > If tree is not empty,
    1. Visit root node of tree
    2. Perform preorder traversal of its left subtree
    3. Perform preorder traversal of its right 
subtree

- __inOrder Traversal__ : the preOrder method do the following:
    * starts from the root
    * visits the left child of each node and then the node before any other node.

    > if tree is not empty,
    1. Perform inorder traversal of left subtree of root
    2. Visit root node of tree
    3. Perform inorder traversal of its right subtree

- __postOrder Traversal__ : the postOrder method do the following: 
    * starts from the root node
    * visit the children of each node and then the node.
    * visits the root node.

    > If tree is not empty,
    1. Perform postorder traversal of left subtree of root
    2. Perform postorder traversal of right subtree of root
    3.  Visit root node of tree
    