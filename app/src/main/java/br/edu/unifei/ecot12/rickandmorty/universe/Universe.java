package br.edu.unifei.ecot12.rickandmorty.universe;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    private String name;
    private String dimension;
    private List<String> specificRules;
    private List<Planet> planets;

    public Universe(String name, String dimension, List<String> specificRules) {
        this.name = name;
        this.dimension = dimension;
        this.specificRules = specificRules != null ? specificRules : new ArrayList<>();
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public List<String> getSpecificRules() {
        return specificRules;
    }

    public void setSpecificRules(List<String> specificRules) {
        this.specificRules = specificRules;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

   
}
