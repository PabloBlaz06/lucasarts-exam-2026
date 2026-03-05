package org.Domain;

import java.util.ArrayList;

public class GetCharactersUseCase {
     private CharacterRepository characterRepository;

    public void getCharacterRepository(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public ArrayList<CharacterModem> execute(){
        return characterRepository.getCharacter();
    }
}
