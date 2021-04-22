package system;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Inventory {

    private String weapon;
    private String armor;
    private int gold;
    private int silver;
    private int copper;


    public String getWeapon() {
        return weapon;
    }

    public String getArmor() {
        return armor;
    }

    public String weaponToString() throws IOException {


        return Files.readAllLines(Path.of("src/Weapons.txt")).get(0);

    }
}
