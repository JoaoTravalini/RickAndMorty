package br.edu.unifei.ecot12.rickandmorty.inventions;

import br.edu.unifei.ecot12.rickandmorty.characters.Scientist;

public class Spaceship extends Invention {
    private String fuel;
    private int speed;

    public Spaceship(String name, String function, Scientist creator, String fuel, int speed) {
        super(name, function, creator); 
        this.fuel = fuel;
        this.speed = speed;
    }
    

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}
