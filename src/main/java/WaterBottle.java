public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }


    public int Volume() {
        return volume;
    }

    public int drink() {
        return volume -= 10;
    }

    public int empty() {
        return volume = 0;
    }

    public int fill() {
        return volume = 100;
    }
}
//Water Bottle
//Create a water bottle class with a volume property.
//The volume should start at 100.
//Add a drink function that takes 10 from the volume each time it is called.
//Create an empty function that brings the volume down to 0.
//Create a fill function that fills the volume back to 100.
