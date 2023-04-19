public class Main {
    public static void main(String[] args) {
        FleetOfCars LassesCarRental = new FleetOfCars();
        Car electricCar = new ElectricCar("SD20564", "Volkswagen","ID.5",5,1000,1500);
        Car gasolinCar = new GasolinCar("JH33198","Skoda", "Fabia",5,15);
        Car dieselCar = new DieselCar("UI45444","Peugeot", "308",5,27,true);
        LassesCarRental.addCar(electricCar);
        LassesCarRental.addCar(gasolinCar);
        LassesCarRental.addCar(dieselCar);
        int totalRegFee = LassesCarRental.getTotalRegistrationFeeForFleet();
        System.out.println(totalRegFee);
    }
}
