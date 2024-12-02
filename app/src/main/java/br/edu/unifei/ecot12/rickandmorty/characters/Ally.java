package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class Ally extends Character {
    private int loyalty;

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Loyalty: " + loyalty);
    }

    public Ally(String name, String species, List<String> abilities, Planet planet, int loyalty) {
        super(name, species, abilities, planet);
        this.loyalty = loyalty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    
}
