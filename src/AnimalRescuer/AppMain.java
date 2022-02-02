package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Chiuaua soundBlasters = initDogValues();
        Girl mina = initGirlValues();

        mina.setDogName(soundBlasters.getName());
        soundBlasters.getsAddopted(mina.getName());

        DogFood purina = initDogFood();

        if (soundBlasters.getHungerLevel() < 4){
            soundBlasters.eat(purina);
        }


    }

    public static Chiuaua initDogValues(){
        Chiuaua soundBlaster = new Chiuaua();
        soundBlaster.setName("SoundBlaster");
        soundBlaster.setAgeYears(3);
        soundBlaster.setColor("Golden");
        soundBlaster.setHealthState(1);
        soundBlaster.setHappynessLevel(0);
        return soundBlaster;
    }

    public static Girl initGirlValues(){
        Girl girl = new Girl();
        girl.setName("Mina");
        return girl;
    }

    public static DogFood initDogFood(){
        DogFood df = new DogFood();
        df.setName("Purina");
        df.setNutrutionValue(0.5f);
        return df;
    }
}
