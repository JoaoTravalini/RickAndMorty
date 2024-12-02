// Morty.java
package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class Morty extends Human {
    private String version;
    private String school;

    public Morty(String name, String species, List<String> abilities, Planet planet, String version, String school) {
        super(name, "Human", abilities, planet, "Student");
        this.version = version;
        this.school = school;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void displayInfo() {
        System.out.println("Morty Smith - Version: " + version + ", School: " + school);
    }
}
