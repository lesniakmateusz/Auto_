public class Car {

    String marka;
    String kolor;
     public Car(String marka, String kolor){

         this.marka = marka;
         this.kolor = kolor;

     }

    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
