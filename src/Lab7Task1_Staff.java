import java.io.IOException;
import java.util.Scanner;

//The Staff class includes two additional fields: education and position, and two
//additional methods (also of void type): initialize1() and print1() - both of these
//methods call the appropriate methods from the Person class in their bodies, but
//also implement handling (downloading and displaying) fields with Staff class.
//In the other class create main() method, and create an object (we can use the
//default constructor) of the class Staff and call the methods on it.
public class Lab7Task1_Staff extends Lab7Task1_Person {
    String education;
    String position;

    public void initialize1() throws IOException {
        initialize();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the education: ");
        education = sc2.nextLine();
        System.out.println("Please enter the position: ");
        position = sc2.nextLine();
    }

    public static class Result {
        public static void main(String[] args) throws IOException {
            Lab7Task1_Staff employee = new Lab7Task1_Staff();
            employee.initialize1();
            employee.print1();
            employee.initialize();
            employee.print();
            Lab7Task1_Person person = new Lab7Task1_Person();
            person.initialize();
            person.print();
        }
    }

    public void print1() throws IOException {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

