package br.edu.unifei.ecot12.rickandmorty.missions;

import java.util.List;
import br.edu.unifei.ecot12.rickandmorty.characters.Character;

public class Mission {
    private String objective;
    private List<Character> involvedCharacters;
    private String destinationUniverse;
    
    public Mission(String objective, List<Character> involvedCharacters, String destinationUniverse) {
        this.objective = objective;
        this.involvedCharacters = involvedCharacters;
        this.destinationUniverse = destinationUniverse;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public List<Character> getInvolvedCharacters() {
        return involvedCharacters;
    }

    public void setInvolvedCharacters(List<Character> involvedCharacters) {
        this.involvedCharacters = involvedCharacters;
    }

    public String getDestinationUniverse() {
        return destinationUniverse;
    }

    public void setDestinationUniverse(String destinationUniverse) {
        this.destinationUniverse = destinationUniverse;
    }

    
}
