package br.edu.unifei.ecot12.rickandmorty.inventions;

import br.edu.unifei.ecot12.rickandmorty.characters.Scientist;
import br.edu.unifei.ecot12.rickandmorty.strategy.InventionBehavior;

public class Invention {
    private String name;
    private String function;
    private Scientist creator;
    private InventionBehavior behavior; 

    public Invention(String name, String function, Scientist creator) {
        this.name = name;
        this.function = function;
        this.creator = creator;
    }

    // Método para definir o comportamento
    public void setBehavior(InventionBehavior behavior) {
        this.behavior = behavior;
    }

    // Método para executar a ação do comportamento
    public void performUse() {
        if (behavior != null) {
            behavior.use();
        } else {
            System.out.println("Behavior not set for " + name);
        }
    }

    public void performModify() {
        if (behavior != null) {
            behavior.modify();
        } else {
            System.out.println("Behavior not set for " + name);
        }
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFunction() { return function; }
    public void setFunction(String function) { this.function = function; }
    public Scientist getCreator() { return creator; }
    public void setCreator(Scientist creator) { this.creator = creator; }
}
