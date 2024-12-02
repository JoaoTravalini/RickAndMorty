package br.edu.unifei.ecot12.rickandmorty.factory;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;
import br.edu.unifei.ecot12.rickandmorty.characters.Morty;
import br.edu.unifei.ecot12.rickandmorty.universe.Planet;

public class MortyFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        List<String> abilities = new ArrayList<>();
        abilities.add("Quick Thinking");
        abilities.add("Survival Instinct");
        
        Planet planet = new Planet("Earth C-137", "Known for its chaotic multiversal activity", null);

        return new Morty(
            "Morty Smith",
            "Human",
            abilities,
            planet,
            "C-137",
            "Unifei"
        );
    }
}
