package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public abstract class Character {
    protected String name;
    protected String species;
    protected List<String> abilities;
    protected Planet planet;

    public Character(String name, String species, List<String> abilities, Planet planet) {
        this.name = name;
        this.species = species;
        this.abilities = abilities;
        this.planet = planet;
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

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
    
    
}
