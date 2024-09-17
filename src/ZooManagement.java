import java.util.Scanner;

class Animal{
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "Animal: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal;
    }

}

class Zoo{
    private Animal [] animal;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String city, String name, int nbrCages){
        animal = new Animal[nbrCages];
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
    }

    public String displayZoo(){
        return  "city :" + this.city + " name :" + this.name + " nbrCages :" + this.nbrCages;
    }


}

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal("mammal","lion",6,true);
        Animal elephant = new Animal("mammal", "elephant", 12, true);
        Animal eagle = new Animal("bird", "eagle", 4, false);
        Animal crocodile = new Animal("reptile", "crocodile", 8, false);

        Zoo myZoo = new Zoo("h-lif","myZoo",4);

        System.out.println(lion.toString());
        System.out.println(elephant.toString());
        System.out.println(eagle.toString());
        System.out.println(crocodile.toString());

        System.out.println(myZoo.displayZoo());



    }
}
