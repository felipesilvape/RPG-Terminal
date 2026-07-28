package com.felipe.rpg.entities.player;

import com.felipe.rpg.entities.Entity;

public abstract class Player extends Entity {

    private int level;
    private int xp;
    private int xpToNextLevel;
    private int mana;
    private int maxMana;

    public Player(String name, int maxHp, int attack, int defense, int maxMana) {
        super(name, maxHp, attack, defense);
        this.level = 1;
        this.xp = 0;
        this.xpToNextLevel = 100;
        this.maxMana = maxMana;
        this.mana= maxMana;
    }

    public void gainXp(int amount) {
        this.xp += amount;
        if(this.xp >= xpToNextLevel) {
            levelUp();
        }
    }

    public void levelUp() {
        this.level++;
        this.xp = 0;
        this.xpToNextLevel = level * 100;

        // Aumenta os atributos herdados de Entity
        setMaxHp(getMaxHp() + 20);
        setHp(getMaxHp());
        setAttack(getAttack() + 5);
        setDefense(getDefense() + 3);
        this.maxMana += 10;
        this.mana= this.maxMana;

        System.out.println("\uD83C\uDF89 Level up! " + getName() + " agora seu nível é " + level);
    }

    public abstract void useSkill(Entity target);

    //Getters
    public int getLevel() { return level; }
    public int getXp() { return xp; }
    public int getXpToNextLevel() { return xpToNextLevel; }
    public int getMana() { return mana; }
    public int getMaxMana() { return maxMana; }

    //Setter
    protected void setMana(int mana) { this.mana = Math.max(0, mana); }
}
