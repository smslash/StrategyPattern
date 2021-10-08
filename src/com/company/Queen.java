package com.company;

public class Queen extends Character {
    @Override
    void display() {
        System.out.println("I am Queen.");
    }

    public Queen() {
        weapon = new SwordBehavior();
    }
}
