package org.Domain;

import java.util.ArrayList;

public interface CharacterRepository {

    public ArrayList<CharacterModem> getCharacter();
    public void saveCharacters(Character character);
    public void execute(String id);
}
