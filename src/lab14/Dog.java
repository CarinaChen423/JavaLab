package lab14;

public class Dog extends Animal implements Run, Speak{

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void speak() {
        System.out.println("Bark bark...");
    }
}
