// Rick.java
package br.edu.unifei.ecot12.rickandmorty.characters;

public class Rick extends Scientist {
    private String version;
    private String originUniverse;

    public Rick(String name, String version, String originUniverse) {
        super(name, "Human", null, 100);
        this.version = version;
        this.originUniverse = originUniverse;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOriginUniverse() {
        return originUniverse;
    }

    public void setOriginUniverse(String originUniverse) {
        this.originUniverse = originUniverse;
    }

    @Override
    public void displayInfo() {
        System.out.println("Rick Sanchez - Version: " + version + ", Origin Universe: " + originUniverse);
    }
}
