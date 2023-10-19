import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a cannot be zero for a quadratic equation.");
            return;
        }

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (delta)
        double discriminant = b * b - 4 * a * c;

        // Initialize the variables for the roots
        double x1 = 0;
        double x2 = 0;

        // Determine the number of roots using a switch statement
        int numberOfRoots;
        if (discriminant > 0) {
            numberOfRoots = 2;
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            numberOfRoots = 1;
            x1 = -b / (2 * a);
        } else {
            numberOfRoots = 0;
        }

        // Display the results with two decimal places
        System.out.printf("a: %.2f%n", a);
        System.out.printf("b: %.2f%n", b);
        System.out.printf("c: %.2f%n", c);

        switch (numberOfRoots) {
            case 2:
                System.out.printf("x1: %.2f%n", x1);
                System.out.printf("x2: %.2f%n", x2);
                break;
            case 1:
                System.out.printf("x1: %.2f%n", x1);
                break;
            case 0:
                System.out.println("No real roots.");
                break;
        }
    }
}
