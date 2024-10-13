package MainZoo;

import Classes.Animal;
import Classes.Zoo;

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal("mammal","lion",6,true);
        Animal elephant = new Animal("mammal", "elephant", 12, true);
        Animal eagle = new Animal("bird", "eagle", 4, false);
        Animal crocodile = new Animal("reptile", "crocodile", 8, false);
        Animal crocodile1 = new Animal("reptile", "crocodile1", 8, false);



        Zoo myZoo = new Zoo("h-lif","myZoo",4 ,null);
        Zoo myZoo1 = new Zoo("h-lif1","myZoo1",4 ,null);

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(eagle);
        myZoo.addAnimal(crocodile);
        myZoo.addAnimal(lion);

        myZoo.removeAnimal(eagle);

        System.out.println(myZoo.searchAnimal(elephant));

        myZoo.addAnimal(eagle);

        System.out.println("Zoo full? :"+ myZoo.isZooFull());


        System.out.println(myZoo.displayZoo());
        System.out.println(myZoo.displayAnimals());


        myZoo1.addAnimal(eagle);
        myZoo1.addAnimal(crocodile);
        myZoo1.addAnimal(lion);

        System.out.println( "\nthe comparer result : " +myZoo.comparerZoo(myZoo1).getName());



    }
}
