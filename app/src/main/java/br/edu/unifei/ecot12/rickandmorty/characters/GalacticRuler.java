package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class GalacticRuler extends Character {
    private int influenceLevel;
    private List<String> lawsCreated;
    public GalacticRuler(String name, String species, List<String> abilities, Planet planet, int influenceLevel,
            List<String> lawsCreated) {
        super(name, species, abilities, planet);
        this.influenceLevel = influenceLevel;
        this.lawsCreated = lawsCreated;
    }
    public int getInfluenceLevel() {
        return influenceLevel;
    }
    public void setInfluenceLevel(int influenceLevel) {
        this.influenceLevel = influenceLevel;
    }
    public List<String> getLawsCreated() {
        return lawsCreated;
    }
    public void setLawsCreated(List<String> lawsCreated) {
        this.lawsCreated = lawsCreated;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Abilities: " + getAbilities());
        System.out.println("Influence: " + influenceLevel);
        System.out.println("Laws created: " + lawsCreated);
    }

        
}
