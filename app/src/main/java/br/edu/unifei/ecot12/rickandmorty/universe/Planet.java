package br.edu.unifei.ecot12.rickandmorty.universe;

public class Planet {
    private String name;
    private String location;
    private int inhabitants;
    
    public Planet(String name, String location, int inhabitants) {
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

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    
}
