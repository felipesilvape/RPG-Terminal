package com.felipe.rpg.entities.player;

import com.felipe.rpg.entities.Entity;

public class Mage extends Player {

    private static final int SKILL_MANA_COST = 35;
    private static final double SKILL_DAMAGE_MULTIPLIER = 2.5;

    public Mage(String name) {
        super(name, 80, 20, 5, 100);
    }

    @Override
    public void useSkill(Entity target) {
        if (getMana() < SKILL_MANA_COST) {
            System.out.println("⚠ Mana insuficiente! Custo: " + SKILL_MANA_COST + " | Mana atual: " + getMana());
            return;
        }

        // Bola de Fogo ignora a defesa do alvo
        int damage = (int) (getAttack() * SKILL_DAMAGE_MULTIPLIER);
        target.takeDamageIgnoringDefense(damage);
        setMana(getMana() - SKILL_MANA_COST);

        System.out.println("🔥 " + getName() + " usa Bola de Fogo em " + target.getName() + "!");
        System.out.println("💥 Dano causado: " + damage + " (ignora defesa)");
    }

    @Override
    public String toString() {
        return getName() + " [HP: " + getHp() + "/" + getMaxHp() + " | Mana: " + getMana() + "/" + getMaxMana() + " | Nível: " + getLevel() + "]";
    }
}