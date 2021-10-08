package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        King king = new King();
        king.display();
        king.Fight();
        System.out.println("Change Weapon");
        king.setWeapon(new KnifeBehavior());
        king.Fight();
    }
}
