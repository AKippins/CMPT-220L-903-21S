package com.company;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import java.util.*;

public class BinaryTree {

    boolean node;
    boolean node_root;

    //add starting node of the tree, called the root
    int node_root_value;

    boolean node_goright;
    boolean node_goleft;



    public bst(boolean node_root){
        this.node= true;
        this.node_root = node_root;
        this.node_root_value = node_root_value;
        this.node_goright = node_goright;
        this.node_goleft =node_goleft;

    }


    private BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree() {
// it inserted this when i created the method, i have no idea why
            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }

            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }
// up to here

            //using the method to create the tree

            bt.add(5);
            bt.add(3);
            bt.add(7);
            bt.add(2);
            bt.add(4);
            bt.add(6);
            bt.add(8);

            return bt;


            @Test
            public void givenABinaryTree_Whenadding Elements_ThenTreeContainsThoseElements(){
                BinaryTree bt =createBinaryTree();

                assertTrue(bt.containsNode)
            }


        };






    }



}
