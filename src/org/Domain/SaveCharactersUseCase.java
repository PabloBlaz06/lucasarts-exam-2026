package org.Domain;

public class SaveCharactersUseCase {
    CharacterRepository characterRepository;

     public SaveCharactersUseCase(CharacterRepository characterRepository){
         this.characterRepository = characterRepository;
     }

    public static void execute(CharacterModem character){
        characterRepository.saveCharacters(character);
    }
}
