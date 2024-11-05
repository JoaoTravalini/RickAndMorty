package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

public abstract class Character {
    protected String name;
    protected String species;
    protected List<String> abilities;

    public Character(String name, String species, List<String> abilities) {
        this.name = name;
        this.species = species;
        this.abilities = abilities;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
    
    
}
