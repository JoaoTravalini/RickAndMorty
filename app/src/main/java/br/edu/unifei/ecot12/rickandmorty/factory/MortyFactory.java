package br.edu.unifei.ecot12.rickandmorty.factory;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;
import br.edu.unifei.ecot12.rickandmorty.characters.Morty;

public class MortyFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Morty("Morty Smith", "C-137", "Harry Herpson High School");
    }
}
