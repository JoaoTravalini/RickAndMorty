package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.inventions.Weapon;

public class Villain extends Character {
    private List<String> motives;
    private int threatLevel;
    private Weapon weapon;

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Motives: " + motives);
        System.out.println("Threat level: " + threatLevel);
        System.out.println("Weapon: " + weapon);
    }

    public Villain(String name, String species, List<String> abilities, List<String> motives, int threatLevel, Weapon weapon) {
        super(name, species, abilities);
        this.motives = motives;
        this.threatLevel = threatLevel;
        this.weapon = weapon;
    }

    public List<String> getMotives() {
        return motives;
    }

    public void setMotives(List<String> motives) {
        this.motives = motives;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    
}
