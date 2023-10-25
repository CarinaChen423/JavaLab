import java.util.Random;

public class Lab3Task5_LargestSmallestNumbers {
    public static void main(String[] args) {
        Random rd=new Random();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int count = 0;

 //Use while loop to find largest and smallest numbers
        while (count < 10) {
            int randomNumber = rd.nextInt(100) + 1;
            if (randomNumber > largest) {
                largest = randomNumber;
            }
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }
            count++;
        }

        System.out.println("The largest Number is: " + largest);
        System.out.println("The smallest Number is: " + smallest);

    }
}
