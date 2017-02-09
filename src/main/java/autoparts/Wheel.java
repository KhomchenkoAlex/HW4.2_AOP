package autoparts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by alex on 01.02.17.
 */
@Component
public class Wheel {

    private Tyres tyres;

    @Autowired
    @Qualifier("SummerTyres")
    public void setTyres( Tyres tyres) {
        this.tyres = tyres;
    }

    public String getTyres() {
        String res = tyres.getName() + " " + tyres.getSize() + "''" + tyres.getType();
        return res;
    }

    public void revolveWheels(){
        System.out.println("Revolve the wheels");
    }
}
