package com.felipe.rpg.entities;

public abstract class Entity {
    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private int defense;

    // Construtor - preenche quando objeto criado
    public Entity(String name, int maxHp, int attack, int defense) {
        this.name = name;
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if(this.hp <= 0) { this.hp = 0; }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void heal(int amount) {
        this.hp = Math.min(maxHp, hp + amount);
    }

    public void takeDamageIgnoringDefense(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }

    //Getters
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }
    public int getAttack() { return attack; }
    public int getDefense() { return defense; }

    //Setters protegidos - subclasses acessam apenas
    protected void setHp(int hp) { this.hp = hp; }
    protected void setMaxHp(int maxHp) { this.maxHp = maxHp; }
    protected void setAttack(int attack) { this.attack = attack; }
    protected void setDefense(int defense) { this.defense = defense; }

    @Override
    public String toString() {
        return name + " [HP: " + hp + "/" + maxHp + "]";
    }
}
