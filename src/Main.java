public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal wolf = new Wolf();
        Animal lion = new Lion();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        wolf.makeSound();
        lion.makeSound();

        dog.eat();

=======
    public static void main(String[] args){
        Car Samochod = new Car(5);

        Samochod.Start();
        Samochod.Stop();

        System.out.println("Liczba miejsc w samochodzie: " + Samochod.getNumberOfSeats());
>>>>>>> 7e7d4db2b547c1fcbefa4134c9aac53077765e7b
    }
}