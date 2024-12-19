package Classes;


public class Aquatic extends Animal implements AnimInterface.Carnivore<AnimInterface.Food>{
    private String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family,name,age,isMammal);
        this.habitat = habitat;

    }

    @Override
    public void eatMeat(AnimInterface.Food meat) {
        if (meat == AnimInterface.Food.MEAT) {
            System.out.println(getName());
        } else {
            System.out.println(getName());
        }
    }

    public void swim(){

       // System.out.println("\nthis Aquatic animal is swimming");

        if (this.getName() == "Dolphin") {
            System.out.println("\nthis Dolphin is swimming");

        } else if (this.getName() == "Penguin") {
            System.out.println("\nthis Penguin is swimming");

        }
    }

    public String toString(){
        return "Aquatic " + super.toString() + "\nHabitat: " + habitat;
    }

    public String getHabitat() {
        return habitat;
    }


    public boolean equal(Aquatic a) {
        if (this.getName().equals(a.getName()) && this.getAge() == a.getAge() && this.getHabitat().equals(a.getHabitat())) {
            return true;
        }
        return false;
    }
}
