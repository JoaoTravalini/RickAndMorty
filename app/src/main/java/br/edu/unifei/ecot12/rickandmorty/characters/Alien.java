package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

public class Alien extends Character {

    private String homePlanet;
    private List<String> extraAbilities;

    public Alien(String name, String species, List<String> abilities, String homePlanet, List<String> extraAbilities) {
        super(name, species, abilities);
        this.homePlanet = homePlanet;
        this.extraAbilities = extraAbilities;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Home Planet: " + homePlanet);
        System.out.println("Extra Abilities: " + extraAbilities);
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public List<String> getExtraAbilities() {
        return extraAbilities;
    }

    public void setExtraAbilities(List<String> extraAbilities) {
        this.extraAbilities = extraAbilities;
    }

}
