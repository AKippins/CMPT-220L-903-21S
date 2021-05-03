package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
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

=======
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
>>>>>>> origin/main
}
