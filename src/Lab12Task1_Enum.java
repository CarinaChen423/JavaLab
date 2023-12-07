enum Shape{
    SQUARE(100), RECTANGLE(29), CIRCLE(78), TRAPEZOID(299), RHOMBUS(80), TRIANGLE(20), OVAL(75), HEXAGON(40);
    private int value;
    Shape(int value){this.value = value;}
    int getValue(){return value;}
}
public class Lab12Task1_Enum {
    public static void main(String[] args) {
        Shape sp;
        for (Shape t : Shape.values()) {
            System.out.println(t + " typical ordinal value is: " + t.ordinal());
            System.out.println("The start value is: " + t.getValue());
        }
    }
}
