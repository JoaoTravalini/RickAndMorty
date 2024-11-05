package br.edu.unifei.ecot12.rickandmorty.factory;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;
import br.edu.unifei.ecot12.rickandmorty.characters.Rick;

public class RickFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Rick("Rick Sanchez", "C-137", "C-137");
    }
}
