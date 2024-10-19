package MainZoo;

import Classes.Animal;
import Classes.Terrestre;
import Classes.Aquatic;
import Classes.Zoo;

public class ZooManagement {
    public static void main(String[] args){
        Terrestre lion = new Terrestre("mammal","Lion",6,true,4);
        Terrestre elephant = new Terrestre("mammal", "Elephant", 12, true,4);
        Animal eagle = new Animal("bird", "Eagle", 4, false);
        Aquatic dolphin = new Aquatic("reptile", "Dolphin", 8, false,"sea");
        Aquatic penguin = new Aquatic("reptile", "Penguin", 8, false,"snow");

        Zoo myZoo = new Zoo("h-lif","myZoo",4 ,null);
        Zoo myZoo1 = new Zoo("h-lif1","myZoo1",4 ,null);

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(penguin);

        myZoo1.addAnimal(eagle);
        myZoo1.addAnimal(penguin);
        myZoo1.addAnimal(dolphin);

        //_________________________________________

        myZoo1.addAquaticAnimal(dolphin);

        System.out.println(myZoo1.displayZoo());
        System.out.println(myZoo1.displayAnimals());

        myZoo1.AquaticsSwim();

        System.out.println(myZoo1.maxPenguinSwimmingDepth());

        myZoo1.displayNumberOfAquaticsByType();

        System.out.println(dolphin.equal(penguin));












    }
}
