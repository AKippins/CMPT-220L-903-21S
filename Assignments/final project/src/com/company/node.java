package com.company;

public class Node extends BinaryTree {

    int data;
    Node right;
    Node left;


//??? do i need htis? less erros if its int
    public Node(boolean node_root) {
        super(node_root);
    }


    public Node(int data) {
        //reference to each child
        //assing data to new node, set left and right null
        this.data = data;
        this.right = null;
        this.left = null;

    }

    public Node root;

    public BST() {
        Node root;
        root = null;
    }


    //cresatew recursive mehtod to insert data in to the tree
    public Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);

        }

        else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        else{
            //if the value already exits
            return current;
        }

        return current;
    }

//starts recusion form the root node
    public void add(int data){
        root=addRecursive(root,data);
    }



    // mehtod to serch the tree
    private boolean containsNodeRecursive(Node current, int data){
        if (current == null){
            return false;
        }
        if (data == current.data){
            return true;
        }
        return data < current.data
            ? containsNodeRecursive(current.left,data)
            : containsNodeRecursive(current.right, data);
    }

    //public mehtod that starts  from the root
    public boolean containsNode(int data){
            return containsNodeRecursive(root,data);


            //crteate a simple test to verify that it contains inserted elements
           @Test
           public void givenABinaryTree_WhenAddingElements_thenTreeContainsThoseElements(){
               BinaryTree bt = createBinaryTree();

               assertTrue(bt.containsNode(3));
               assertTrue(bt.containsNode(4));

               assertFalse(bt.containsNode(1));
        }

    }


    // deleting an element

    private Node deleteRecursive(Node current, int data){
        if (current == null){
            return null;
        }

        if (data== current.data){
            //node to delete found
            // code to dlete the node will go ehre
        }

        if (value < current.value){
            current.left = deleteRecursive(current.left, data);
            return current;
        }
        current.right = deleteRecursive(current.right, data);
        return current;

    }




}


