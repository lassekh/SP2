public abstract class AFuelCar extends ACar {
    private int kmPrLitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();
    public int getKmPrLitre(){
        return this.kmPrLitre;
    }
    @Override
    public String toString(){
        String carFuel = "Fueltype: " + getFuelType() + "\n";
        String carKml = getKmPrLitre() + "\n";
        return  carFuel + carKml + super.toString();
    }
}
