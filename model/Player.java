package model;

import interface_visitor.Visitor;

public class Player implements interface_element.GameCharacter {
    private final String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health); // защита от отрицательного значения
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ")";
    }
}
