package lab14;

public class Cat extends Animal implements Speak, Run{
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow Xiaomi...");
    }
}
