package org.Data;

import org.Domain.CharacterModem;
import org.Domain.CharacterRepository;

import java.util.ArrayList;

public class CharacterDataRepository implements CharacterRepository {

    private CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterDataRepository(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    public ArrayList<CharacterModem> getCharacter() {
        return characterMemLocalDataSource.findAll();
    }

    @Override
    public void saveCharacters(Character character) {
        characterMemLocalDataSource.save(character);
    }

    @Override
    public void execute(String id) {
        characterMemLocalDataSource.delete(id);
    }
}
