package com.company;

public class listitem {
    private String name;
    private int age;



    public listitem(String name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

}
