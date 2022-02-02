package AnimalRescuer;

public abstract class Animal {


    private String color;
    private float ageYears;
    private String name;
    private int noOfLegs;
    private float weight;
    private int heightInCm;
    private float hungerLevel;
    private int thirstLevel;
    private int healthState;
    private String rescuerName;

    public String getRescuerName() {
        return rescuerName;
    }

    public void setRescuerName(String rescuerName) {
        this.rescuerName = rescuerName;
    }

    public int getHappynessLevel() {
        return happynessLevel;
    }

    public void setHappynessLevel(int happynessLevel) {
        this.happynessLevel = happynessLevel;
    }

    private int happynessLevel;


    public float getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(float ageYears) {
        this.ageYears = ageYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public float getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(float hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int getHealthState() {
        return healthState;
    }

    public void setHealthState(int healthState) {
        this.healthState = healthState;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void play();

    public abstract void speak();
}
