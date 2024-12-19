package MainZoo;

import Classes.Animal;
import Classes.Terrestre;
import Classes.Aquatic;
import Classes.Zoo;
import Classes.ZooException;

public class ZooManagement {
    public static void main(String[] args) {
        Terrestre lion = new Terrestre("mammal", "Lion", 6, true, 4);
        Terrestre elephant = new Terrestre("mammal", "Elephant", 12, true, 4);
        Animal eagle = new Animal("bird", "Eagle", 4, false);
        Aquatic dolphin = new Aquatic("reptile", "Dolphin", 8, false, "sea");
        Aquatic penguin = new Aquatic("reptile", "Penguin", 8, false, "snow");

        Zoo myZoo = new Zoo("h-lif", "myZoo", 3, null);

        try {
            myZoo.addAnimal(elephant);
            System.out.println(elephant.getName());
            System.out.println(myZoo.countAnimals());

            myZoo.addAnimal(dolphin);
            System.out.println(dolphin.getName());
            System.out.println(myZoo.countAnimals());

            myZoo.addAnimal(lion);
            System.out.println(lion.getName());
            System.out.println(myZoo.countAnimals());

            myZoo.addAnimal(penguin);
            System.out.println(penguin.getName());
            System.out.println(myZoo.countAnimals());

        } catch (ZooException e) {
            System.out.println(e.getMessage());
        }
    }
}
