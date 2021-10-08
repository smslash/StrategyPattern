package com.company;

public class Troll extends Character {
    @Override
    void display() {
        System.out.println("I am Troll.");
    }

    public Troll() {
        weapon = new KnifeBehavior();
    }
}
