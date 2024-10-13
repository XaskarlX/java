package Classes;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private final int maxCages = 25;

    public Zoo(String city, String name, int nbrCages , Animal[] animals) {
        this.animals = new Animal[nbrCages];
        this.city = city;
        if(name == null || name.isEmpty()) {
            System.out.println("Name can't be null");
            this.name = "default";
        }
        if(nbrCages > maxCages){
            this.nbrCages = maxCages;
        }else {
            this.nbrCages = nbrCages;
        }
    }

    public int countAnimals() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }
        return count;
    }

    public boolean addAnimal(Animal animal) {
        int currentCount = countAnimals();
        for(Animal anima : animals){
            if(anima == animal) {
                return false;
            }
        }
        if (this.isZooFull()) {
            return false;
        } else {
            animals[currentCount] = animal;
            return true;
        }
    }

    public String displayZoo() {
        return "\nzoo ==> city :" + this.city + " name :" + this.name + " nbrCages :" + this.nbrCages;
    }

    public String displayAnimals() {
        return " \nanimal :" + Arrays.toString(this.animals);
    }

    public int searchAnimal(Animal animal) {
        int currentCount = countAnimals();
        for(int i = 0; i < currentCount; i++) {
            if(animals[i].getName().equals(animal.getName())) {
                return i+1;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int currentCount = countAnimals();
        for(int i = 0; i < currentCount; i++) {
            if(animals[i].getName().equals(animal.getName())) {

                for (int j = i; j < currentCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[currentCount - 1] = null;

                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(){
        int count = countAnimals();
        int cage = nbrCages;
        if(count == cage){
            return true;
        }
        return false;
    }

    public Zoo comparerZoo(Zoo z){
        int count1=this.countAnimals();
        int count2=z.countAnimals();

        if (count1 > count2) {
            return this;
        } else if (count2 > count1) {
            return z;
        } else {
            return null;
        }
    }

    public String getName(){
        return this.name;
    }


}
