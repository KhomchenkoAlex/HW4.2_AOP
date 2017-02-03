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

    public String carToString() {
        String res = "This car has ";
        res = res + engine.getEngineCapacity() + "cc engine capacity and wheel with " + wheel.getTyres() + " tyres.";
        return res;
    }
}
