package autoparts;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by alex on 01.02.17.
 */

public class Engine {
    @Value("${car.engineCapacity}")
    private int engineCapacity;

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void startEngine(){
        System.out.println("Start the engine...");
    }

    public void stopEngine(){
        System.out.println("Stop the engine...");
    }
}
