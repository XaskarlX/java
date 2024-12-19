package Classes;

public class AnimInterface {
    public interface Carnivore<T> {
        void eatMeat(T meat);
    }

    public interface Herbivore<T> {
        void eatPlant(T plant);
    }

    public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
        void eatPlantAndMeat(T food);
    }

    public enum Food {
        MEAT, PLANT, BOTH
    }
}
