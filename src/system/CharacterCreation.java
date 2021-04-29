package system;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class CharacterCreation {
    Random random = new Random();
    Dice dice = new Dice();
    private String name;
    private int level = 1;
    private int hp;
    private int ac;
    private String characterRace;
    Inventory inventory = new Inventory();
    Scanner scanner = new Scanner(System.in);
    private int[] abilityScores;


    public CharacterCreation() {


    } //TODO create the character creation menu.



    public void displayInv() throws IOException {
        System.out.println(inventory.weaponToString());
    }

    public int determineOneAbilityScore() {
        int[] ability = new int[4];
        int abilityScore = 0;
        for (int i = 0; i < ability.length; i++) {
            ability[i] = random.nextInt(6) + 1;
        }
        Arrays.sort(ability);
        ability[0] = 0;
        System.out.println(Arrays.toString(ability));
        for (int j : ability) {
            abilityScore += j;
        }
        return abilityScore;

    }

    public void determineAllAbilityScores() {
        int[] ability = new int[6];
        for (int i = 0; i < ability.length; i++) {
            ability[i] = determineOneAbilityScore();
        }
        Arrays.sort(ability);
        System.out.println(Arrays.toString(ability));

    }




    @Override
    public String toString() {
        return "Character:\n" +
                "Name = " + name +
                "\nLevel = " + level +
                "\nHp = " + hp +
                "\nAc = " + ac +
                "\nClass = " + CharacterClass.characterClass +
                "\nRace = " + characterRace;
    }


}

