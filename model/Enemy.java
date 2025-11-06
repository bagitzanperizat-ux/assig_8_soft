package model;

import interface_visitor.Visitor;

public class Enemy implements interface_element.GameCharacter {
    private final String type;
    private int strength;

    public Enemy(String type, int strength) {
        this.type = type;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = Math.max(0, strength);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return type + " (Power: " + strength + ")";
    }
}
