package autoparts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alex on 01.02.17.
 */
@Component
public class Wheel {
    private Tyres tyres;

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String getTyres() {
        String res = tyres.getName() + " " + tyres.getSize() + "''";
        return res;
    }
}
