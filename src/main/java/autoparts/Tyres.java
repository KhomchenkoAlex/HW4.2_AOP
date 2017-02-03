package autoparts;

/**
 * Created by alex on 01.02.17.
 */
public abstract class Tyres {
    private int size;
    private String name;

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
}


