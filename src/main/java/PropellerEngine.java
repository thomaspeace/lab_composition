public class PropellerEngine implements IEngine{

    private int horsePower;
    private int propellerRadius;

    public PropellerEngine(int horsePower, int propellerRadius){
        this.horsePower = horsePower;
        this.propellerRadius = propellerRadius;
    }

    //Getters & Setters
    public int getHorsePower(){
        return this.horsePower;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public int getPropellerRadius(){
        return this.propellerRadius;
    }
    public void setPropellerRadius(int propellerRadius){
        this.propellerRadius = propellerRadius;
    }
}
