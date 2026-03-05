package org.Domain;

public class DeleteCharacterUseCase {

    private CharacterRepository characterRepository;

    public DeleteCharacterUseCase(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    public void execute(String id){
        characterRepository.execute(id);
    }
}
