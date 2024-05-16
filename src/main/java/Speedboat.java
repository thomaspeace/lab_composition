public class Speedboat extends Vehicle implements IWaterVehicle {

    private boolean needsCrew;
    private String hullType;

    public Speedboat(float weight, int maxSpeed, boolean needsCrew, String hullType){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.hullType = hullType;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
    }

    //Getters & Setters
    public String getHullType() {
        return this.hullType;
    }
    public void setHullType(String hullType){
        this.hullType = hullType;
    }

}
