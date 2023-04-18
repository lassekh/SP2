public class GasolinCar extends AFuelCar {
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public int getRegistrationFee(){
        int fee = 0;
        //For en Benzinbil er afgiften afhængig af kilometer pr liter.
        // Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr
        // hvis mellem 15 km/l og 20 km/l er prisen 1050 kr
        // hvis mellem 10 km/l og 15 km/l er prisen 2340 kr
        // hvis mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l er prisen 10470 kr.
        if(getKmPrLitre() <= 50 && getKmPrLitre() >= 20){
            fee = 330;
        } else if(getKmPrLitre() < 20 && getKmPrLitre() >= 15){
            fee = 1050;
        } else if(getKmPrLitre() < 15 && getKmPrLitre() >= 10){
            fee = 2340;
        } else if(getKmPrLitre() < 10 && getKmPrLitre() >= 5){
            fee = 5500;
        } else if(getKmPrLitre() < 5){
            fee = 10470;
        }
        return fee;
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }

    @Override
    public String toString(){
        String carFee = "Reg. fee: " + getRegistrationFee();
        return super.toString() + carFee;
    }
}
