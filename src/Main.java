public class Main {
    public static void main(String[] args) {
        FleetOfCars lassesCarRental = new FleetOfCars();
        Car electricCar = new ElectricCar("SD20564", "Volkswagen","ID.5",5,77,430);
        Car gasolinCar = new GasolinCar("JH33198","Skoda", "Fabia",5,15);
        Car dieselCar = new DieselCar("UI45444","Peugeot", "308",5,27,true);
        lassesCarRental.addCar(electricCar);
        lassesCarRental.addCar(gasolinCar);
        lassesCarRental.addCar(dieselCar);
        System.out.println(lassesCarRental);

    }
}
