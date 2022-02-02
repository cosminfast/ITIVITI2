package AnimalRescuer;

public abstract class Cat extends Animal{

    private int noOfLivesLeft;

    public int getNoOfLivesLeft() {
        return noOfLivesLeft;
    }

    public void setNoOfLivesLeft(int noOfLivesLeft) {
        this.noOfLivesLeft = noOfLivesLeft;
    }

    public void purr(){
        System.out.println("purring");
    }

    @Override
    public void eat(){
        System.out.println("eating purrina");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {

    }


}
