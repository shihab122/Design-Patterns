package com.shihabhossain;

public class User {
    // Fields
    public String name;

    public User(String name, int age){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hi, my name is " + this.name);
    }

}
