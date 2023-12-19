package lab14;

public class HomeAnimal<T extends Animal & Run & Speak> {

    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void sleepOnTheCouch() {
        System.out.println(animal.getClass().getSimpleName() + " is sleeping on the couch");
    }

}
