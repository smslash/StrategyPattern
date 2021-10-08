package com.company;

public class King extends Character {
    @Override
    void display() {
        System.out.println("I am King.");
    }

    public King(){
        weapon = new SwordBehavior();
    }
}
