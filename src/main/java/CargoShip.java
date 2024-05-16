public class CargoShip extends Vehicle implements IWaterVehicle, IEngine {

    private int numberOfContainers;
    private String hullType;
    private IEngine engine;

    public CargoShip(float weight, int maxSpeed, String hullType, int numberOfContainers, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = hullType;
        this.engine = engine;
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
    public IEngine getEngine() {
        return this.engine;
    }

    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }
    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }
}
