package br.edu.unifei.ecot12.rickandmorty.strategy;

public class WeaponBehavior implements InventionBehavior {
    @Override
    public void use() {
        System.out.println("Using weapon...");
    }

    @Override
    public void modify() {
        System.out.println("Modifying weapon...");
    }
}