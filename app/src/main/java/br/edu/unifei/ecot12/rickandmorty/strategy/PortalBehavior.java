package br.edu.unifei.ecot12.rickandmorty.strategy;

public class PortalBehavior implements InventionBehavior {
    @Override
    public void use() {
        System.out.println("Using portal...");
    }

    @Override
    public void modify() {
        System.out.println("Modifying portal...");
    }
}
