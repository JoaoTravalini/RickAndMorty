package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class Alien extends Character {

    private List<String> extraAbilities;

    public Alien(String name, String species, List<String> abilities, Planet planet, List<String> extraAbilities) {
        super(name, species, abilities, planet);
        this.extraAbilities = extraAbilities;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Home Planet: " + getPlanet());
        System.out.println("Extra Abilities: " + extraAbilities);
    }

    public List<String> getExtraAbilities() {
        return extraAbilities;
    }

    public void setExtraAbilities(List<String> extraAbilities) {
        this.extraAbilities = extraAbilities;
    }

}
