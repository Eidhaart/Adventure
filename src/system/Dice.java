package system;

import java.util.Random;

public class Dice {

    Random random = new Random();

    private int d20 = random.nextInt(20)+1;
    private int d4 = random.nextInt(4)+1;
    private int d6 = random.nextInt(6)+1;
    private int d8 = random.nextInt(8)+1;

    public int getD20(){
        return d20;
    }

}
