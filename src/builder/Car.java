package builder;

public class Car {
    int wheels;
    String name;
    String engineType;
    String model;

    public Car(int wheels, String name, String engineType, String model) {
        this.wheels = wheels;
        this.name = name;
        this.engineType = engineType;
        this.model = model;
    }

    public Car() {
    }
    public  Car setWheels(int wheels)
    {
        this.wheels=wheels;
        return this;
    }

    public Car setName(String name){
        this.name=name;
        return this;
    }
    public Car setEngineType(String engineType){
        this.engineType=engineType;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
