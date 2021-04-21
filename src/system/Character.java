package system;

import java.util.Scanner;

public class Character {
    private String name;
    private int level = 1;
    private int hp;
    private int ac;
    private String characterClass;
    private String characterRace;
    Inventory inventory = new Inventory();
    Scanner scanner = new Scanner(System.in);


    public Character() {
        System.out.println("What is your name traveller?");
        this.name = scanner.nextLine();
        System.out.println("What is your profession");
        this.characterClass = scanner.nextLine();
        System.out.println("What race are you?");
        this.characterRace = scanner.nextLine();

    }

    public void displayInv() {
        System.out.println(inventory.getArmor());
        System.out.println(inventory.getWeapon());
    }

    @Override
    public String toString() {
        return "Character:\n" +
                "Name = " + name +
                "\nLevel = " + level +
                "\nHp = " + hp +
                "\nAc = " + ac +
                "\nClass = " + characterClass +
                "\nRace = " + characterRace ;
    }
}
