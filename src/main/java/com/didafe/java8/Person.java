package com.didafe.java8;

public class Person {

    private String name;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void say(String s) {
        System.out.println("A new person is saiying something..." + s);
    }
}
