import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alex on 01.02.17.
 */

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Car car = (Car) applicationContext.getBean("Car");
        System.out.println(car.carToString());
    }
}
