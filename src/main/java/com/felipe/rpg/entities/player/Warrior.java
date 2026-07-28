package com.felipe.rpg.entities.player;

import com.felipe.rpg.entities.Entity;

public class Warrior extends Player {

    private static final int SKILL_MANA_COST = 20;
    private static final double SKILL_DAMAGE_MULTIPLIER = 2.0;

    public Warrior(String name) {
        super(name, 120, 15, 10, 50);
    }

    @Override
    public void useSkill(Entity target) {
        if (getMana() < SKILL_MANA_COST) {
            System.out.println("⚠ Mana insuficiente! Custo: " + SKILL_MANA_COST + " | Mana atual: " + getMana());
            return;
        }

        int damage = (int) (getAttack() * SKILL_DAMAGE_MULTIPLIER);
        target.takeDamage(damage);
        setMana(getMana() - SKILL_MANA_COST);

        System.out.println("⚔ " + getName() + " usa Golpe Brutal em " + target.getName() + "!");
        System.out.println("💥 Dano causado: " + damage);
    }

    @Override
    public String toString() {
        return getName() + " [HP: " + getHp() + "/" + getMaxHp() + " | Mana: " + getMana() + "/" + getMaxMana() + " | Nível: " + getLevel() + "]";
    }
}

