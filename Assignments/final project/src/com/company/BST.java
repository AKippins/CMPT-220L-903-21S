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
    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);

    }


    // deleting an element, find the node to delete in a similar way as before

   /* private Node deleteRecursive(Node current, int data){
        if (current == null){
            return null;
        }

        if (data== current.getData()){
            //node to delete found
            // code to delete the node will go here
        }

        if (data < current.getData()){
            current.setLeft(deleteRecursive(current.getLeft(), data));
            return current;
        }
        current.setRight(deleteRecursive(current.getRight(), data));
        return current;

        // implemet when node is a leaf node
        if (current.getLeft() == null && current.getRight() == null){
            return null;
        }

        // continue the case when node has one child

        if (current.getRight() == null) {
            return current.getLeft();
        }

        if (current.getLeft() == null) {
            return current.getRight();
        }*/

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



    public void delete(int data) {
    //    root = deleteRecursive(root, data);
    }


    // depth first search, in order traversal, pre order traversal and post order traversal

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


    // post order traversal visits left sub tree, then right,
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
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.getData());

            if (node.getLeft() != null) {
                nodes.add(node.getLeft());
            }

            if (node.getRight() != null) {
                nodes.add(node.getRight());
            }
        }


    }

}

