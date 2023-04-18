public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return this.batteryCapacity;
    }
    public int getMaxRangeKm(){
        return this.maxRange;
    }
    public int getWhPrKm(){
        int whPrKm = getBatteryCapacityKWh()/getMaxRangeKm();
        return whPrKm;
    }
    public int getRegistrationFee(){
        double kwhToKml = (int)getWhPrKm()/91.25/100;
        int kml = (int)kwhToKml;
        int fee = 0;
        if(kml <= 50 && kml >= 20){
            fee = 330;
        } else if(kml < 20 && kml >= 15){
            fee = 1050;
        } else if(kml < 15 && kml >= 10){
            fee = 2340;
        } else if(kml < 10 && kml >= 5){
            fee = 5500;
        } else if(kml < 5){
            fee = 10470;
        }
        return fee;
    }
    @Override
    public String toString(){
        String carFee = "Reg. fee: " + getRegistrationFee();
        return super.toString() + carFee; //todo: remember to change
    }
}
