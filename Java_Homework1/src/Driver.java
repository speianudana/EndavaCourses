public class Driver extends Man {
    private Car car;

    Driver(Man man){
        super(man.getName(), man.getAge());
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
