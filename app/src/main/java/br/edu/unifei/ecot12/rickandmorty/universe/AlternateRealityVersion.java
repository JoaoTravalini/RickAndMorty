package br.edu.unifei.ecot12.rickandmorty.universe;

import br.edu.unifei.ecot12.rickandmorty.characters.Character;

public class AlternateRealityVersion {
    private Character originalCharacter;
    private String originUniverse;
    private String variationDetails;
    
    public AlternateRealityVersion(Character originalCharacter, String originUniverse, String variationDetails) {
        this.originalCharacter = originalCharacter;
        this.originUniverse = originUniverse;
        this.variationDetails = variationDetails;
    }

    public Character getOriginalCharacter() {
        return originalCharacter;
    }

    public void setOriginalCharacter(Character originalCharacter) {
        this.originalCharacter = originalCharacter;
    }

    public String getOriginUniverse() {
        return originUniverse;
    }

    public void setOriginUniverse(String originUniverse) {
        this.originUniverse = originUniverse;
    }

    public String getVariationDetails() {
        return variationDetails;
    }

    public void setVariationDetails(String variationDetails) {
        this.variationDetails = variationDetails;
    }

   
}
