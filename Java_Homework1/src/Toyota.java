import java.util.ArrayList;

public class Toyota extends Car {

    public Toyota(Color color, String model, String typeBox, int capacity, Driver driver, ArrayList<Man> passangers) throws Exception1 {
        super(color, model, typeBox, capacity, driver, passangers);
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota is accelerating.");
    }
}
