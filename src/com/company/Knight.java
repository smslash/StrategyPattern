package com.company;

public class Knight extends Character {
    @Override
    void display() {
        System.out.println("I am Knight.");
    }

    public Knight() {
        weapon = new KnifeBehavior();
    }
}
