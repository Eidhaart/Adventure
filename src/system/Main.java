package system;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Character character = new Character();
        System.out.println(character);
        character.displayInv();
        character.determineAllAbilityScores();
    }
}
