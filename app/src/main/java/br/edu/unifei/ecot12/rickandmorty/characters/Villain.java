package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

public class Villain extends Character {
    private List<String> motives;
    private int threatLevel;

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Motives: " + motives);
        System.out.println("Threat level: " + threatLevel);
    }

    public Villain(String name, String species, List<String> abilities, List<String> motives, int threatLevel) {
        super(name, species, abilities);
        this.motives = motives;
        this.threatLevel = threatLevel;
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

    
}
