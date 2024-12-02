// Rick.java
package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class Rick extends Scientist {
    private String version;

    public Rick(String name, String species, List<String> abilities, Planet planet, int intelligenceLevel, String version) {
        super(name, "Human", abilities, planet, 100);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void displayInfo() {
        System.out.println("Rick Sanchez - Version: " + version);
    }
}
