package Classes;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "Animal: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal;
    }

    public String getName(){
        return this.name;
    }

}