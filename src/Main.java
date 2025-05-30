public class Main {
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

    }
}