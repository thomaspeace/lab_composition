public class CargoShip extends Vehicle implements IWaterVehicle {

    private int numberOfContainers;
    private String hullType;

    public CargoShip(float weight, int maxSpeed, String hullType, int numberOfContainers){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = hullType;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    //Getters & Setters
    public String getHullType() {
        return this.hullType;
    }
    public void setHullType(String hullType){
        this.hullType = hullType;
    }
}
