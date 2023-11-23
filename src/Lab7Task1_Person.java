import java.util.Scanner;

public class Lab7Task1_Person {
    //The Person class contains fields: surname, first name, street, zipCode, city and
    //two methods (can be void) initialize() and print(). The first one allows you to
    //enter data, while the second one displays it on the console.
    String surname;
    String first_name;
    String street;
    String zipCode;
    String city;

    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your surname: ");
        surname = sc.nextLine();
        System.out.println("Please enter your first name: ");
        first_name = sc.nextLine();
        System.out.println("Please enter street: ");
        street = sc.nextLine();
        System.out.println("Please enter zipcode: ");
        zipCode = sc.nextLine();
        System.out.println("Please enter city: ");
        city = sc.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First name: " + first_name);
        System.out.println("Street: " + street);
        System.out.println("Zipcode: " + zipCode);
        System.out.println("City: " + city);
    }
}
