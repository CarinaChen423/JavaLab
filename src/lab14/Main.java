package lab14;

public class Main {
    public static void main(String[] args) {


        HomeAnimal<Dog> animal1 = new HomeAnimal<>(new Dog());
        animal1.getAnimal().run();
        animal1.getAnimal().speak();
        animal1.sleepOnTheCouch();

        HomeAnimal<Cat> animal2 = new HomeAnimal<>(new Cat());
        animal2.getAnimal().run();
        animal2.getAnimal().speak();
        animal2.sleepOnTheCouch();

//        HomeAnimal<Shark> animal3 = new HomeAnimal<>(new Shark());
//        animal3.getAnimal().run();
//        animal3.getAnimal().speak();
//        animal3.sleepOnTheCouch();

    }
}
