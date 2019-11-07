import java.util.ArrayList;
import java.util.Objects;

public abstract class Car implements Accelerate {
    private int capacity;
    private Driver driver;
    private Color color;
    private String model;
    private String typeBox;

    private ArrayList<Man> passangers;

    private static ArrayList<String> modelList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity &&
                Objects.equals(driver, car.driver) &&
                color == car.color &&
                Objects.equals(model, car.model) &&
                Objects.equals(typeBox, car.typeBox) &&
                Objects.equals(passangers, car.passangers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, driver, color, model, typeBox, passangers);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("capacity=").append(capacity);
        sb.append(", driver=").append(driver);
        sb.append(", color=").append(color);
        sb.append(", model='").append(model).append('\'');
        sb.append(", typeBox='").append(typeBox).append('\'');
        sb.append(", passangers=").append(passangers);
        sb.append('}');
        return sb.toString();
    }

    protected void speedSwitching() {
        System.out.println("Car has automatic gear");

    }

    protected void speedSwitching(int speedNumber) {
        System.out.println("Car is manual and has speed: " + speedNumber);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !modelList.contains(model)) {
            modelList.add(model);
            this.model = model;
        } else {
            System.out.println("Such model already exists");
        }
    }

    public String getTypeBox() {
        return typeBox;
    }

    public void setTypeBox(String typeBox) {
        this.typeBox = typeBox;
    }

    public ArrayList<Man> getPassangers() {
        return passangers;
    }

    public void setPassengers(ArrayList<Man> passengers) throws Exception1 {
        if(this.capacity < passengers.size() + 1){
            throw new Exception1("To many passengers");
        }
        else {
            this.passangers = passengers;
        }    }

    public static ArrayList<String> getModelList() {
        return modelList;
    }

    public static void setModelList(ArrayList<String> modelList) {
        Car.modelList = modelList;
    }

    Car(Color color, String model, String typeBox, int capacity, Driver driver, ArrayList<Man> passengers) throws Exception1 {
        this.color = color;
        setModel(model);
        this.typeBox = typeBox;
        this.capacity = capacity;
        this.driver = driver;
        setPassengers(passengers);
    }


}
