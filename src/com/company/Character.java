package com.company;

public abstract class Character {

    WeaponBehavior weapon;

    public Character(){

    }
    abstract void display();

    public void Fight(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
