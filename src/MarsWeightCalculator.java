public class MarsWeightCalculator {
    public static void main(String[] args) {
        float marsWeight;
        float earthWeight = 83.0F;
        double marsWeightDouble;
        int marsWeightInt;
        char marsWeightChar;
        marsWeight = earthWeight * 0.38F;
        System.out.println("83.0kg on earth is " + marsWeight + "kg on mars.");
        marsWeightDouble = (double) marsWeight;
        System.out.println("Kilograms convert to double is:" + marsWeightDouble + "kg");
        System.out.println("Kilograms in 4 decimal length is: " + String.format("%.04f", marsWeightDouble) + "kg");
        marsWeightInt = (int) marsWeightDouble;
        System.out.println("Kilograms convert to int is: " + marsWeightInt + "kg");
        marsWeightChar = (char) marsWeightInt;
        System.out.println("Integer kilograms converts to char is: " + marsWeightChar);
        marsWeightChar += (char) (marsWeightChar + 12);
        System.out.println("Result: " + (int) marsWeightChar);


    }


}

