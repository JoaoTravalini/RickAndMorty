// Morty.java
package br.edu.unifei.ecot12.rickandmorty.characters;

public class Morty extends Human {
    private String version;
    private String school;

    public Morty(String name, String version, String school) {
        super(name, "Human", null, "Student", "Earth");
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
