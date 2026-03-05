package org.Data;



import org.Domain.CharacterModem;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {

    private ArrayList<Character> CharacterList = new ArrayList<>();

    public ArrayList<Character> findAll() {
        return CharacterList;
    }

    public void save(Character character) {
        CharacterList.add(character);
    }

    public void delete(String characterId) {
        CharacterList.removeIf(character -> Objects.equals(CharacterModem.getId(), characterId));
    }
}
