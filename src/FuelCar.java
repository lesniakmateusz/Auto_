public class FuelCar extends Car {

    double ilosc_litrow;


    public FuelCar(String marka, String kolor, double ilosc_litrow){
        super(marka,kolor);
        this.ilosc_litrow = ilosc_litrow;

    }


    public String getInfo(){

        return"kolor:"+" " + kolor + " " + "marka:" + " " + marka  + " " + "ilosc litrow:"+ " " + ilosc_litrow;


    }
}
