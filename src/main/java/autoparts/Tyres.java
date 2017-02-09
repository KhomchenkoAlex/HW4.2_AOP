package autoparts;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by alex on 01.02.17.
 */
public abstract class Tyres {
    @Value("${car.tyreSize}")
    private int size;
    @Value("${car.tyreName}")
    private String name;

    private String type;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType(){return type;}
}


