package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class Human extends Character {
    private String occupation;

    public Human(String name, String species, List<String> abilities, Planet planet, String occupation) {
        super(name, species, abilities, planet);
        this.occupation = occupation;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Home Planet: " + getPlanet());
        System.out.println("Occupation: " + occupation);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    } 
}
