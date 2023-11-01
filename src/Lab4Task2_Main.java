public class Lab4Task2_Main {
    public static void main(String[] args) {
        Lab4Task2_Car car=new Lab4Task2_Car("XC90","Volvo",2020,298339,"Grey",30);
        System.out.println(car.toString());
        car.sell();
        System.out.println(car.toString());
        car.setColor("Black");
        car.setModel("XC60");
        System.out.println(car.toString());

    }

}
