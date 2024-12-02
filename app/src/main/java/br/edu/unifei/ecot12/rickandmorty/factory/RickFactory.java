package br.edu.unifei.ecot12.rickandmorty.factory;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;
import br.edu.unifei.ecot12.rickandmorty.characters.Rick;
import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class RickFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        // Definindo habilidades do Rick
        List<String> abilities = new ArrayList<>();
        abilities.add("Genius-level intellect");
        abilities.add("Master engineer");
        abilities.add("Expert in multiverse travel");

        // Criando o planeta de origem do Rick
        Planet planet = new Planet("Earth C-137", "Known for its chaotic multiversal activity", null);

        // Criando o Rick com atributos completos
        return new Rick(
            "Rick Sanchez",
            "Human",
            abilities,
            planet,
            100, // Inteligência máxima
            "C-137"
        );
    }
}
