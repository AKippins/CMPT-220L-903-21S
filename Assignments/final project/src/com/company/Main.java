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

        System.out.print("pre order traversal");
        bt.traversePreOrder(bt.getRoot());
        System.out.println();
        System.out.print("post order traversal");
        bt.traversePostOrder(bt.getRoot());
        System.out.println();
        System.out.print("in order traversal");
        bt.traverseInOrder(bt.getRoot());
        System.out.println();
        System.out.println("findNth largest"+bt.findNthLargest(2));
        System.out.println();
        System.out.println("height of bst:"+bt.findHeightOfBst(bt.getRoot()));
        System.out.println("contains 4:"+bt.containsNode(4));
        bt.delete(4);
        System.out.println("contains 4:"+bt.containsNode(4));
        bt.BFS(bt.getRoot());
        System.out.println();
        bt.DFS(bt.getRoot());



    }

}

