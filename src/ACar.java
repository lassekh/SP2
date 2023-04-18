public abstract class ACar implements Car {
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    @Override
    public String toString(){
        String carReg = "Reg. number: " + getRegistrationNumber() + "\n";
        String carBrand = "Brand: " + getMake() + "\n";
        String carModel = "Model: " + getModel() + "\n";
        String carDoors = "Number of doors: " + getNumberOfDoors() + "\n";
        return carReg + carBrand + carModel + carDoors;
    }
}
