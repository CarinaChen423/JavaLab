import java.util.Random;

public class BricksContainer {
    public static void main(String[] args) {
        //Lab2, task 4
        // Generate a random bricks number between 50 and 100 (inclusive)
        int amountOfBricks=new Random().nextInt(51)+50;
        // Generate a random container capacity between 5 and 10 (inclusive)
        int containerCapacity=new Random().nextInt(6)+4;
        //Calculate the full containers
        int fullContainers=amountOfBricks/containerCapacity;
        //Calculate the remaining blocks
        int remainingBlocks = amountOfBricks % containerCapacity;
        // Calculate the total number of containers (full and not full)
        int totalContainers=fullContainers+(remainingBlocks > 0 ? 1 : 0);

        System.out.println("We have "+amountOfBricks+" lego bricks");
        System.out.println("The container capacity is "+containerCapacity);
        System.out.println("Numbers of full containers: "+fullContainers);
        System.out.println("Numbers of containers (full and not full): "+totalContainers);
        System.out.println("Numbers of blocks in the not full containers: "+remainingBlocks);
    }
}
