public class Main {
    public static void main(String[] args){
        Car Samochod = new Car(5);

        Samochod.Start();
        Samochod.Stop();

        System.out.println("Liczba miejsc w samochodzie: " + Samochod.getNumberOfSeats());
    }
}