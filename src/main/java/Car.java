import autoparts.Engine;
import autoparts.Wheel;

/**
 * Created by alex on 01.02.17.
 */
public class Car {
    Wheel wheel;
    Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {

        this.wheel = wheel;
    }

    public void startCar (){
        System.out.println("The car moves...");
    }

    public void stopCar(){
        System.out.println("The car stops...");
    }

    public String carToString() {
        String res = "This car has ";
        res = res + engine.getEngineCapacity() + "cc engine capacity and wheels with " + wheel.getTyres() + " tyres.";
        return res;
    }
}
