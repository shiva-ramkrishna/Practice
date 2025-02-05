package builder;

public class Main {

    public static void main(String[] args) {
        Car c=new Car().setWheels(4).setName("Creta").setEngineType("v4");
        System.out.println(c);


    }
}
