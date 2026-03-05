package org.Presentation;

import org.Data.CharacterDataRepository;
import org.Data.CharacterMemLocalDataSource;
import org.Domain.CharacterModem;
import org.Domain.DeleteCharacterUseCase;
import org.Domain.GetCharactersUseCase;
import org.Domain.SaveCharactersUseCase;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterView {
    public static void printCharacter(){
        GetCharactersUseCase getCharactersUseCase = new GetCharactersUseCase(new CharacterDataRepository(CharacterMemLocalDataSource.CharacterList()));
        ArrayList<CharacterModem> characters = getCharactersUseCase.execute();
        System.out.println(characters);
    }

    public static void saveCharacter(){
        CharacterModem newCharacter = new CharacterModem("10","Pepe",5,"volar");

        SaveCharactersUseCase saveCharactersUseCase = new SaveCharactersUseCase(new CharacterDataRepository(CharacterMemLocalDataSource.CharacterList()));
        SaveCharactersUseCase.execute(newCharacter);

    }

    public static void deleteCharacter(String id){

        DeleteCharacterUseCase deleteCharacterUseCase = new DeleteCharacterUseCase(new CharacterDataRepository(CharacterMemLocalDataSource.CharacterList()));

        deleteCharacterUseCase.execute(id);

    }
}
