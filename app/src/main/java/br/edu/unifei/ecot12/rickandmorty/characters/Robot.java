package br.edu.unifei.ecot12.rickandmorty.characters;

import java.util.List;

public class Robot {
    private String model;
    private List<String> abilities;
    private List<String> functions;
    
    public Robot(String model, List<String> abilities, List<String> functions) {
        this.model = model;
        this.abilities = abilities;
        this.functions = functions;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public List<String> getAbilities() {
        return abilities;
    }
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
    public List<String> getFunctions() {
        return functions;
    }
    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    
}
