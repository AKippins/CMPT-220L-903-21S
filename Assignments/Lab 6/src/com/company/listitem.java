package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listitem {
    private int name;
    private int age;


    public listitem(int name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public int getName(){
        return this.name;
    }


    public static void delete(int index, List<listitem> List){
        List.remove(index);
    }

    public static void order(List <listitem> List){
        for (int j = 0; j < List.size(); j++) {
        listitem item = (listitem) List.get(j);
        System.out.println(item.getName());
        System.out.println(item.getAge());
    }
    }



    public static void add(List<listitem> List){
        Scanner henry = new Scanner(System.in);
        System.out.println("enter number");

        int numbers = henry.nextInt();


        List.add(new listitem(numbers, 19));
    }


}
