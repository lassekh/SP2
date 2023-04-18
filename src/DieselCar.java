public class DieselCar extends AFuelCar{
    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter(){
        return this.particleFilter;
    }
    public int getRegistrationFee(){
        int fee = 0;
        //Hvis bilen kører mellem 20 km/l og 50 km/l er udligningsafgiften 130 kr
        //hvis mellem 15 km/l og 20 km/l er den 1390 kr
        //hvis mellem 10 km/l og 15 km/l er den 1850 kr
        //hvis mellem 5 km/l og 10 km/l er den 2770 kr
        //hvis under 5 km/l er den 15260 kr
        //Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har et partikelfilter monteret.
        if(getKmPrLitre() <= 50 && getKmPrLitre() >= 20){
            fee = 330+130;
        } else if(getKmPrLitre() < 20 && getKmPrLitre() >= 15){
            fee = 1050+1390;
        } else if(getKmPrLitre() < 15 && getKmPrLitre() >= 10){
            fee = 2340+1850;
        } else if(getKmPrLitre() < 10 && getKmPrLitre() >= 5){
            fee = 5500+2770;
        } else if(getKmPrLitre() < 5){
            fee = 10470+15260;
        }
        if(hasParticleFilter()){
            fee += 1000;
        }
        return fee;
    }
    @Override
    public String toString(){
        return ""; //todo: remember to change
    }
}
