public class Runner {

    public static void main(String[] args) {

        //we are expecting "IEngine" in the car constructor, but we can call the CombustionEngine constructor
        //as we want to make a CombustionEngine.
        IEngine hondaEngine = new CombustionEngine(99, "01/01/2023");
        Car jazz = new Car(1100f, 160, "hatchback", hondaEngine);

        System.out.println(jazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(1000, 100);
        jazz.setEngine(electricEngine);

        System.out.println(jazz.getHorsePower());

    }

}