package com.company;

import java.util.LinkedList;
import java.util.Queue;


import java.util.*;

public class BST {

   private Node root;

    private ArrayList<Node>preorder;


    private ArrayList<Node>postorder;


    private ArrayList<Node>inorder;


    //getter for root
    public Node getRoot(){
        return root;
    }

    public BST() {
        root = null;
        preorder = new ArrayList<Node>();
        postorder = new ArrayList<Node>();
        inorder = new ArrayList<Node>();
    }

    //starts recursion form the root node
    public void add(int data) {
        root = addRecursive(root, data);
    }

    //create recursive method to insert data in to the tree
    public Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.getData()) {
            current.setLeft(addRecursive(current.getLeft(), data));

        } else if (data > current.getData()) {
            current.setRight(addRecursive(current.getRight(), data));
        } else {
            //if the value already exits
            return current;
        }

        return current;
    }


    // method to search the tree
    private boolean containsNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.getData()) {
            return true;
        }
        return data < current.getData()
                ? containsNodeRecursive(current.getLeft(), data)
                : containsNodeRecursive(current.getRight(), data);
    }

    //public method that starts  from the root
    //finding elements
    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);

    }


    public int findHeightOfBst(Node node){
        if (node==null){
            return 0;
        }
        else{
           int left_height = findHeightOfBst(node.getLeft());
           int right_height = findHeightOfBst(node.getRight());
           return Math.max(left_height,right_height)+1;
        }
    }


    public void delete(int data) {
        root = deleteRecursive(root, data);
    }


    // deleting a specific node
    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.getData()) {
            return null;
        }

        if (data < current.getData()) {
            current.setLeft(deleteRecursive(current.getLeft(), data));
        }
        current.setRight(deleteRecursive(current.getRight(), data));
        return current;

    }

    //handle case when node ahs two children

    //find smallest node
    public int findSmallestValue(Node current) {
        if (current.getLeft() == null) {
            return current.getData();
        } else {
            return findSmallestValue(current.getLeft());
        }
    }


    public int findLargestValue(Node current) {
        if (current.getRight() == null) {
            return current.getData();
        } else {
            return findLargestValue(current.getRight());
        }
    }

    public int findNthLargest(int n) {
        if (inorder.isEmpty()){
            traverseInOrder(root);
        }
       if (n>inorder.size()||n<0){
           System.out.println("your out of bounds");
           return -1;
       }


       int index = inorder.size()-n;
       return inorder.get(index).getData();
    }



    // depth first search, in order traversal, pre order traversal and post order traversal

    public void DFS(Node node) {
        if (node == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.add(node);

        while (!stack.isEmpty()) {

            Node n = stack.pop();

            if (n.getLeft() != null) {
                stack.add(n.getLeft());
            }

            if (n.getRight() != null) {
                stack.add(n.getRight());
            }

            System.out.print(" " + n.getData());


        }


    }






    //in order traversal visits left sub tree first, then the root node, then the right sub tree
    public void traverseInOrder(Node node) {
        if (node == root){
            inorder = new ArrayList<Node>();
        }

        if (node != null) {
            traverseInOrder(node.getLeft());
            inorder.add(node);
            System.out.print(" " + node.getData());
            traverseInOrder(node.getRight());
        }
    }


    // pre order traversal visit the root, then the left, then the right

    public void traversePreOrder(Node node) {
        if (node == root) {
            preorder = new ArrayList<Node>();
        }
            if (node != null) {
                preorder.add(node);
                System.out.print(" " + node.getData());
                traversePreOrder(node.getLeft());
                traversePreOrder(node.getRight());
            }
    }


    //post order traversal visits left sub tree, then right,
    public void traversePostOrder(Node node) {
        if (node== root){
            postorder = new ArrayList<Node>();
        }

        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(" " + node.getData());
            postorder.add(node);
        }
    }




    // breath first search. i used a queue to hold the nodes form each level in order
    public void BFS(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);

        while (!nodes.isEmpty()) {

            Node n = nodes.remove();

            System.out.print(" " + n.getData());

            if (n.getLeft() != null) {
                nodes.add(n.getLeft());
            }

            if (n.getRight() != null) {
                nodes.add(n.getRight());
            }
        }


    }

}

