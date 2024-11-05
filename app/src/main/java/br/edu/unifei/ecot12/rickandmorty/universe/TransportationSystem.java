package br.edu.unifei.ecot12.rickandmorty.universe;

public class TransportationSystem {
    private String name;
    private Universe originUniverse;
    private Universe destination;
    
    public TransportationSystem(String name, Universe originUniverse, Universe destination) {
        this.name = name;
        this.originUniverse = originUniverse;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Universe getOriginUniverse() {
        return originUniverse;
    }

    public void setOriginUniverse(Universe originUniverse) {
        this.originUniverse = originUniverse;
    }

    public Universe getDestination() {
        return destination;
    }

    public void setDestination(Universe destination) {
        this.destination = destination;
    }

   
}
