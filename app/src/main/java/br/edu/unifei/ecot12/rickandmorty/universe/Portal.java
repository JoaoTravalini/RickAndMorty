package br.edu.unifei.ecot12.rickandmorty.universe;

public class Portal extends TransportationSystem {
    private int stability;
    private int energyRequired;
    
    public Portal(String name, Universe originUniverse, Universe destination, int stability, int energyRequired) {
        super(name, originUniverse, destination);
        this.stability = stability;
        this.energyRequired = energyRequired;
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public int getEnergyRequired() {
        return energyRequired;
    }

    public void setEnergyRequired(int energyRequired) {
        this.energyRequired = energyRequired;
    }

    
}
