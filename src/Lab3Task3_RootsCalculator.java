import java.util.Random;
import java.util.Scanner;

public class Lab3Task3_RootsCalculator {
    public static void main(String[] args) {
//Check the value of a
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value of a: ");
        double a=sc.nextDouble();
        if(a==0){
            System.out.println("Please enter the correct value! ");
            return;
        }

        System.out.println("Please enter the value of b: ");
        double b=sc.nextDouble();
        System.out.println("Please enter the value of c: ");
        double c=sc.nextDouble();
//Calculate the delta
        double delta=b*b-4*a*c;
        double x1=0;
        double x2=0;
//Determine the roots number
        int numbersOfRoots;
        if(delta>0){
            numbersOfRoots=2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta==0) {
            numbersOfRoots=2;
            x1 = -b / (2 * a);
        } else {
            numbersOfRoots = 0;
        }

        System.out.printf("a: %.2f%n", a);
        System.out.printf("b: %.2f%n", b);
        System.out.printf("c: %.2f%n", c);

            switch (numbersOfRoots) {
                case 2:
                    System.out.printf("x1: %.2f%n", x1);
                    System.out.printf("x2: %.2f%n", x2);
                    break;
                case 1:
                    System.out.printf("x1: %.2f%n", x1);
                    break;
                case 0:
                    System.out.println("There is no real roots.");
                    break;

        }

    }
}
