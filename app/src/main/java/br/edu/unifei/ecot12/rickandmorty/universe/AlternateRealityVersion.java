package br.edu.unifei.ecot12.rickandmorty.universe;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;

public class AlternateRealityVersion {
    private Character originalCharacter;
    private String variationDetails;
    
    public AlternateRealityVersion(Character originalCharacter, String variationDetails) {
        this.originalCharacter = originalCharacter;
        this.variationDetails = variationDetails;
    }

    public Character getOriginalCharacter() {
        return originalCharacter;
    }

    public void setOriginalCharacter(Character originalCharacter) {
        this.originalCharacter = originalCharacter;
    }

    public String getVariationDetails() {
        return variationDetails;
    }

    public void setVariationDetails(String variationDetails) {
        this.variationDetails = variationDetails;
    }

   
}
