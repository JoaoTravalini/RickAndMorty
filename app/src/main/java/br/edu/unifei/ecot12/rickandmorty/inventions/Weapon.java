package br.edu.unifei.ecot12.rickandmorty.inventions;

import br.edu.unifei.ecot12.rickandmorty.characters.Scientist;

public class Weapon extends Invention {
    private String type;
    private int damage;

    public Weapon(String name, String function, Scientist creator, String type, int damage) {
        super(name, function, creator);
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    
}
