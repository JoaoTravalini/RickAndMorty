package br.edu.unifei.ecot12.rickandmorty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;
import br.edu.unifei.ecot12.rickandmorty.characters.Scientist;
import br.edu.unifei.ecot12.rickandmorty.factory.MortyFactory;
import br.edu.unifei.ecot12.rickandmorty.factory.RickFactory;
import br.edu.unifei.ecot12.rickandmorty.inventions.Spaceship;
import br.edu.unifei.ecot12.rickandmorty.inventions.Weapon;
import br.edu.unifei.ecot12.rickandmorty.missions.Mission;
import br.edu.unifei.ecot12.rickandmorty.strategy.PortalBehavior;
import br.edu.unifei.ecot12.rickandmorty.strategy.WeaponBehavior;
import br.edu.unifei.ecot12.rickandmorty.universe.AlternateRealityVersion;
import br.edu.unifei.ecot12.rickandmorty.universe.Planet;
import br.edu.unifei.ecot12.rickandmorty.universe.Universe;

public class Main {
    public static void main(String[] args) {
        // Criando o universo e planetas
        Universe universe = new Universe("Multiverse", "Infinite Dimensions", null);
        Planet earthC137 = new Planet("Earth C-137", "Universe C-137", null);
        universe.addPlanet(earthC137);

        // Usando as fábricas para criar os personagens Rick e Morty
        MortyFactory mortyFactory = new MortyFactory();
        RickFactory rickFactory = new RickFactory();

        Character morty = mortyFactory.createCharacter();
        Character rick = rickFactory.createCharacter();

        // Exibindo as informações dos personagens
        morty.displayInfo();
        rick.displayInfo();

        // Criando um cientista (para passar como parâmetro)
         Planet earth = new Planet("Earth", "Solar System", null);  // Ajuste conforme sua classe Planet

        // Criando uma lista de habilidades do cientista (exemplo)
        List<String> skills = Arrays.asList("Portal Gun", "Genetic Engineering", "Interdimensional Travel");

        // Criando um cientista com o construtor correto
        Scientist creator = new Scientist("Rick Sanchez", "Human", skills, earth, 70);  // Ajuste conforme sua implementação do construtor

        // Criando invenções
        Spaceship spaceship = new Spaceship("Spaceship", "Travel between universes", creator, "Plutonium", 5000);
        Weapon laserGun = new Weapon("Laser Gun", "Destroy enemies", creator, "Laser", 100);

        // Definindo o comportamento das invenções
        spaceship.setBehavior(new PortalBehavior());
        laserGun.setBehavior(new WeaponBehavior());

        // Usando as invenções
        spaceship.performUse();
        laserGun.performUse();

        // Criando uma missão
        List<Character> missionCharacters = new ArrayList<>();
        missionCharacters.add(rick);
        missionCharacters.add(morty);

        Mission mission = new Mission("Save the multiverse", missionCharacters, "Alternate Dimension");

        // Exibindo informações da missão
        System.out.println("\nMission Objective: " + mission.getObjective());
        System.out.println("Destination Universe: " + mission.getDestinationUniverse());
        System.out.println("Involved Characters:");
        for (Character character : mission.getInvolvedCharacters()) {
            character.displayInfo();
        }

        // Criando uma versão de realidade alternativa do Morty
        AlternateRealityVersion alternateMorty = new AlternateRealityVersion(morty, "Evil Morty");

        // Exibindo informações da versão alternativa
        System.out.println("\nAlternate Reality Version:");
        System.out.println("Original Character: " + alternateMorty.getOriginalCharacter().getName());
        System.out.println("Variation Details: " + alternateMorty.getVariationDetails());
    }
}
