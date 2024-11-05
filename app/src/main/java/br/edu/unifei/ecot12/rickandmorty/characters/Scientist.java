package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.inventions.Invention;

public class Scientist extends Character {
    private List<Invention> inventions;
    private int intelligenceLevel;

    public Scientist(String name, String species, List<String> abilities, int intelligenceLevel) {
    super(name, species, abilities);
    this.intelligenceLevel = intelligenceLevel;
    this.inventions = new ArrayList<>();  
}


    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Inventions: " + inventions);
        System.out.println("Intelligence: " + intelligenceLevel);
    }

    public List<Invention> getInventions() {
        return inventions;
    }

    public void setInventions(List<Invention> inventions) {
        this.inventions = inventions;
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        this.intelligenceLevel = intelligenceLevel;
    }

    
}
