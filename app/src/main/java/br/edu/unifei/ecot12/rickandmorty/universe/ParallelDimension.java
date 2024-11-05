package br.edu.unifei.ecot12.rickandmorty.universe;

import java.util.List;

public class ParallelDimension extends Universe {

    private int instability;
    private int population;

    public ParallelDimension(String name, String dimension, List<String> specificRules, int instability,
            int population) {
        super(name, dimension, specificRules);
        this.instability = instability;
        this.population = population;
    }

    public int getInstability() {
        return instability;
    }

    public void setInstability(int instability) {
        this.instability = instability;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
