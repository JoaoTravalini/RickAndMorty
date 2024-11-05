package br.edu.unifei.ecot12.rickandmorty.universe;

import java.util.List;

public class Planet {
    private String name;
    private String location;
    private List<Character> inhabitants; 
    
    public Planet(String name, String location, List<Character> inhabitants) {
        this.name = name;
        this.location = location;
        this.inhabitants = inhabitants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Character> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<Character> inhabitants) {
        this.inhabitants = inhabitants;
    }

    
}
