package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    List<listitem>List = new ArrayList <listitem>();


    for (int i=0; i<5; i++) {
        Scanner henry =new Scanner (System.in);
        System.out.println("enter numbers");

        String numbers = henry.nextLine();
        System.out.println("Numbers are "+ numbers);

        List.add(new listitem("henry",19));
        }

    for (int j=0; j<5;j++){
        listitem item = List.get(j);
        System.out.println(item.getName() );
        System.out.println(item.getAge());



    }




    }
}
