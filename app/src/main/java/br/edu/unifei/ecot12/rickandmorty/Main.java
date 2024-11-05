package br.edu.unifei.ecot12.rickandmorty;

import br.edu.unifei.ecot12.rickandmorty.characters.Morty;
import br.edu.unifei.ecot12.rickandmorty.characters.Rick;
import br.edu.unifei.ecot12.rickandmorty.factory.MortyFactory;
import br.edu.unifei.ecot12.rickandmorty.factory.RickFactory;
import br.edu.unifei.ecot12.rickandmorty.inventions.Invention;
import br.edu.unifei.ecot12.rickandmorty.strategy.PortalBehavior;
import br.edu.unifei.ecot12.rickandmorty.strategy.WeaponBehavior;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        RickFactory rickFactory = new RickFactory();
        MortyFactory mortyFactory = new MortyFactory();

        Rick rick = (Rick) rickFactory.createCharacter();
        Morty morty = (Morty) mortyFactory.createCharacter();

        rick.displayInfo();
        morty.displayInfo();

        // Criando invenções
        Invention portalGun = new Invention("Portal Gun", "Creates portals", rick);
        Invention laserGun = new Invention("Laser Gun", "Shoots lasers", rick);

        // Configurando comportamentos
        portalGun.setBehavior(new PortalBehavior());
        laserGun.setBehavior(new WeaponBehavior());

        // Testando os comportamentos
        System.out.println("Testing Portal Gun:");
        portalGun.performUse();    
        portalGun.performModify(); 

        System.out.println("\nTesting Laser Gun:");
        laserGun.performUse();     
        laserGun.performModify();  
    }
}