package system;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        CharacterCreation newChar = new CharacterCreation();
        System.out.println(newChar);
        newChar.determineAllAbilityScores();
        newChar.displayInv();



    }
}
