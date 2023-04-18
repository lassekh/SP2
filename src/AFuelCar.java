public abstract class AFuelCar extends ACar {
    private int kmPrLitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){
        return ""; //todo: remember to change
    }
    public int getKmPrLitre(){
        return this.kmPrLitre;
    }
    @Override
    public String toString(){
        return ""; //todo: remember to change
    }
}
