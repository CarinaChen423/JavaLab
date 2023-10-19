import java.util.Scanner;

public class Lab3Task2_BMICalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter your height in cm (and press enter): ");
        float heightChen= sc.nextFloat();
        System.out.println("Please enter your weight in kg (and press enter): ");
        float weightChen=sc.nextFloat();
        float bmi= weightChen*10000 / (float) Math.pow(heightChen, 2);
        sc.close();

        if (bmi <= 16.00) {
            System.out.println("Your BMI is: " + bmi + "\nYou are Starvation");
        } else if(bmi>=16.00 && bmi<=16.99){
            System.out.println("Your BMI is: "+bmi+"\nYou are emaciation");
        } else if (bmi>=17.00 && bmi<=18.49) {
            System.out.println("Your BMI is: "+bmi+"\nYou are underweight");
        } else if (bmi>=18.50 && bmi<=22.99) {
            System.out.println("Your BMI is: "+bmi+"\nYou are normal (low range)");
        } else if (bmi>=23.00 && bmi<=24.99) {
            System.out.println("Your BMI is: "+bmi+"\nYou are normal (high range)");
        } else if (bmi>=25.00 && bmi<=27.49) {
            System.out.println("Your BMI is: "+bmi+"\nYou are overweight (low range)");
        } else if (bmi>=27.50 && bmi<=29.99) {
            System.out.println("Your BMI is: "+bmi+"\nYou are overweight (high range)");
        } else if (bmi>=30.00 && bmi<=34.90) {
            System.out.println("Your BMI is: "+bmi+"\nYou are 1st degree obesity");
        } else if (bmi>=35.00 && bmi<=39.90) {
            System.out.println("Your BMI is: "+bmi+"\nYou are 2nd degree obesity");
        } else if (bmi>=40.00) {
            System.out.println("Your BMI is: "+bmi+"\nYou are 3rd degree obesity");
        }

    }
}
