public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {

        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {

        return numberOfSeats;
    }

    @Override
    public void Start() {
        System.out.println("Samochód został uruchomiony...");
    }
    @Override
    public void Stop() {
        System.out.println("Samochód się zatrzymał");
    }
}

