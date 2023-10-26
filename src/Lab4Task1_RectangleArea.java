import java.util.Scanner;

public class Lab4Task1_RectangleArea
{
    public static void main(String[] args) {

    }
    double length;
    double width;
    double area;
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the rectangle length: ");
        length = scanner.nextDouble();
        System.out.print("Please enter the rectangle width: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }
    public void fieldDisplay() {
        System.out.println("Rectangle Information:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}
