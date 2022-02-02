package AnimalRescuer;

public class Dog extends Animal {


    public void eat(DogFood df) {
        if (getHungerLevel() > 1) {
            setHungerLevel(getHungerLevel() - df.getNutrutionValue());
            if (getHappynessLevel() < 5)
                setHappynessLevel(getHappynessLevel() + 1);
        } else System.out.println("Dog is refusing to eat");

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {

    }

    @Override
    public void speak() {

    }


    public void getsAddopted(String addopterName) {
        setHappynessLevel(3);
        setRescuerName(addopterName);
    }
}
