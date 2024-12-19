package MainZoo;

import Classes.Animal;
import Classes.Terrestre;
import Classes.Aquatic;
import Classes.AnimInterface;

public class ZooManagement {
    public static void main(String[] args) {
        // Create animals
        Aquatic dolphin = new Aquatic("Mammal", "Dolphin", 8, true, "Sea");
        Terrestre lion = new Terrestre("Mammal", "Lion", 6, true, 4);
        Terrestre bear = new Terrestre("Mammal", "Bear", 10, true, 4);


        dolphin.eatMeat(AnimInterface.Food.MEAT);
        dolphin.eatMeat(AnimInterface.Food.PLANT);


        lion.eatMeat(AnimInterface.Food.MEAT);
        lion.eatPlant(AnimInterface.Food.PLANT);
        lion.eatPlantAndMeat(AnimInterface.Food.BOTH);


        bear.eatMeat(AnimInterface.Food.MEAT);
        bear.eatPlant(AnimInterface.Food.PLANT);
    }
}
