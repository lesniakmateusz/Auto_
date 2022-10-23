public class ElectricCar extends Car {

    double pojemnosc;


    public ElectricCar(String marka, String kolor, double pojemnosc){
        super(marka,kolor);
        this.pojemnosc = pojemnosc;

    }


    public String getInfo(){

        return"kolor:"+" " + kolor + " " + "marka:" + " " + marka  + " " + "pojemnosc:"+ " " + pojemnosc;


    }
}
