package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<listitem> List = new ArrayList<listitem>();

        Scanner george = new Scanner(System.in);
        System.out.println("please enter the index of item you wish to remove");
        int index = george.nextInt();

        for (int f=0; f<4;f++) {
            listitem.add(List);
         }

        listitem.order(List);

        listitem.delete(index, List);

    }

}
