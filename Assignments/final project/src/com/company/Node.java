package com.company;

import java.util.LinkedList;
import java.util.Queue;


public class Node{

   private int data;
   private Node right;
   private Node left;


    public Node(int data) {
        //reference to each child
        //assin data to new node, set left and right null
        this.data = data;
        this.right = null;
        this.left = null;

    }

    public Node root;

    // is a getter, gets data value
    public int getData(){
        return data;
    }

    public Node getRight(){
        return right;
    }


    public Node getLeft(){
        return left;
    }

    //setters
    public void setData(int data){
        this.data=data;
    }

    public void setRight(Node right){
        this.right=right;
    }

    public void setLeft(Node left){
        this.left=left;
    }





}




