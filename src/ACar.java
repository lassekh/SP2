public abstract class ACar implements Car {
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

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
        return 0; //todo: remember to change
    }
    @Override
    public String toString(){
        return ""; //todo: remember to change
    }
}
