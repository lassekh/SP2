import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;
    public FleetOfCars(){
        this.fleet = new ArrayList<>();
    }
    public void addCar(Car car){
        this.fleet.add(car);
    }

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for(int i = 0; i < fleet.size(); i++){
            int regFee = fleet.get(i).getRegistrationFee();
            totalFee += regFee;
        }
        return totalFee;
    }
    @Override
    public String toString(){
        int counter = 0;
        for(Car c : getFleet()){
            counter++;
            System.out.println("Car number " + counter + "\n---------------------");
            System.out.println(c + "\n---------------------");
        }
        return "The total registration fee for Lasses Car Rental is: " + getTotalRegistrationFeeForFleet();
    }
}
