package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.MakeSpecialAttack();

        Magical magical = new Magical();
        magical.MakeSpecialAttack();

        Mental mental = new Mental();
        mental.MakeSpecialAttack();
    }
}
