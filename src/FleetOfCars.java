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
        int total =0;
        return total;
    }
    @Override
    public String toString(){
        String car;
        for(int i = 0; i < fleet.size(); i++){
            //car = fleet.get(i.);
        }
        return "";
    }
}
