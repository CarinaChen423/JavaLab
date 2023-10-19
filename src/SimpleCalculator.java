import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        float firstNumberChen=sc.nextFloat();
        System.out.println("Please enter the second number: ");
        float secondNumberChen= sc.nextFloat();
        sc.close();
//Calculation
        float sum=firstNumberChen+secondNumberChen;
        float difference=firstNumberChen-secondNumberChen;
        float product=firstNumberChen*secondNumberChen;
        float quotient=(secondNumberChen!=0)?(firstNumberChen/secondNumberChen):0;
//Print the results
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);
        System.out.printf("Quotient: %.2f%n", quotient);

    }
}
