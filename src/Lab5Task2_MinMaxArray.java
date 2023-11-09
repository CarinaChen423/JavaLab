import java.util.Random;

//create a one-dimensional array with 10
//elements chosen randomly from 1 to 100. Then use a loop to find the smallest and largest element of the table.
public class Lab5Task2_MinMaxArray {
    public static void main(String[] args) {
        Random r=new Random();
        int [] number=new int[10];
        int max = 0;
        int min = number[0];

        for(int i = 0; i < 10; i++) {
            int randNum = r.nextInt(10);
            number[i] = randNum;
            if (randNum>max) {
                max = randNum;
            }
            if (i > 0) {
                if (randNum < number[0]) {
                    min = randNum;
                }
            }
        }

        System.out.println("Here is the Array elements:");
        for (int x : number) {
            System.out.print("["+ x + "]");
        }
        System.out.println("\n");
        System.out.println("Minimum number of array is: " + min);
        System.out.println("Maximum number of array is: " + max);

    }
}
