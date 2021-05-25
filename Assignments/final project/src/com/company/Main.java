package com.company;



public class Main {
    public static void main(String[] args) {
        int data;
        BST bt = new BST();
        bt.add(5);
        bt.add(3);
        bt.add(7);
        bt.add(2);
        bt.add(4);
        bt.add(6);
        bt.add(8);


        bt.traversePreOrder(bt.getRoot());
        System.out.println();
        bt.traversePostOrder(bt.getRoot());
        System.out.println();
        bt.traverseInOrder(bt.getRoot());
        System.out.println();
        System.out.println(bt.findNthLargest(2));



    }

}

