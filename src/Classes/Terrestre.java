package Classes;

public class Terrestre extends Animal implements AnimInterface.Omnivore<AnimInterface.Food> {
    private int nbrLegs;

    public Terrestre() {}

    public Terrestre(String family, String name, int age, boolean isMammal,int nbrLegs) {
        super(family,name,age,isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(AnimInterface.Food meat) {
        if (meat == AnimInterface.Food.MEAT || meat == AnimInterface.Food.BOTH) {
            System.out.println(getName() );
        } else {
            System.out.println(getName() );
        }
    }

    @Override
    public void eatPlant(AnimInterface.Food plant) {
        if (plant == AnimInterface.Food.PLANT || plant == AnimInterface.Food.BOTH) {
            System.out.println(getName());
        } else {
            System.out.println(getName() );
        }
    }

    @Override
    public void eatPlantAndMeat(AnimInterface.Food food) {
        if (food == AnimInterface.Food.BOTH) {
            System.out.println(getName() );
        }
    }

    public String toString(){
        return "Terrestre " +super.toString() + "\nNbr Legs: " + nbrLegs;
    }
}