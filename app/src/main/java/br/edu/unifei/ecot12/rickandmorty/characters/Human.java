package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

public class Human extends Character {
    private String occupation;
    private String homePlanet;

    public Human(String name, String species, List<String> abilities, String occupation, String homePlanet) {
        super(name, species, abilities);
        this.occupation = occupation;
        this.homePlanet = homePlanet;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Home Planet: " + homePlanet);
        System.out.println("Occupation: " + occupation);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    
}
