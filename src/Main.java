public class Main {
    public static void main(String[] args) {

        Car car = new Car("Honda","niebieski");
        ElectricCar electricCar = new ElectricCar("mercedes","czarny",4000);
        FuelCar fuelCar = new FuelCar("BMW","granatowy",65);

        System.out.println(car);
        System.out.println(electricCar.getInfo());
        System.out.println(fuelCar.getInfo());


    }
}