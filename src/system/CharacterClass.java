package system;

public class CharacterClass {

    public static  String characterClass;
    Inventory inventory = new Inventory();

    public void setCharacterClass(String charClass) {
        charClass.toLowerCase();
        switch (charClass) {
            case "paladin":
                CharacterClass.characterClass = "Paladin";
                inventory.setStartSet(0);
                break;
            case "fighter":
                CharacterClass.characterClass = "Fighter";
                break;
            case "barbarian":
                CharacterClass.characterClass = "Barbarian";
                break;
            case "rogue":
                CharacterClass.characterClass = "Rogue";
                inventory.setStartSet(2);
                break;
            case "ranger":
                CharacterClass.characterClass = "Ranger";
                break;
            case "monk":
                CharacterClass.characterClass = "Monk";
                inventory.setStartSet(1);
                break;
            case "bard":
                CharacterClass.characterClass = "Bard";
                break;
            case "wizard":
                CharacterClass.characterClass = "Wizard";
                break;
            case "sorcerer":
                CharacterClass.characterClass = "Sorcerer";
                break;
            case "druid":
                CharacterClass.characterClass = "Druid";
                break;
            case "cleric":
                CharacterClass.characterClass = "Cleric";
                break;
            case "warlock":
                CharacterClass.characterClass = "Warlock";
                break;

        }
    }

}
