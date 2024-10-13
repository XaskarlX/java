package Classes;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family,name,age,isMammal);
        this.habitat = habitat;

    }

    public void swim(){

        System.out.println("\nthis Aquatic animal is swimming");

        if (this.getName() == "Dolphin") {
            System.out.println("\nthis Dolphin is swimming");

        } else if (this.getName() == "Penguin") {
            System.out.println("\nthis Penguin is swimming");

        }
    }

    public String toString(){
        return "Aquatic " + super.toString() + "\nHabitat: " + habitat;
    }

}
