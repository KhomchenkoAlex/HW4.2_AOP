package autoparts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by alex on 01.02.17.
 */


public class WinterTyres extends Tyres {
    private String type = "winter";

    @Value("${car.tyreSize}")
    private int size;
    @Value("${car.tyreName}")
    private String name;


}
