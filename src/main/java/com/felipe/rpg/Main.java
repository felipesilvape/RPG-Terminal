package com.felipe.rpg;

import com.felipe.rpg.entities.player.Mage;
import com.felipe.rpg.entities.player.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn");
        Mage mage = new Mage("Gandalf");
        System.out.println(warrior);
        System.out.println(mage);
    }
}