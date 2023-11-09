import java.util.Scanner;

//Take two strings from the user (as objects of the String type) and then concatenate these two strings
public class Lab5Task4_ConcatenatingString {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Input two strings from the user
                System.out.print("Enter the first string: ");
                String firstString = scanner.nextLine();
                System.out.print("Enter the second string: ");
                String secondString = scanner.nextLine();

                // Concatenate the two strings
                String concatenatedString1 = firstString + secondString;
                String concatenatedString2 = secondString + firstString;

                // Check if the concatenated strings are alternating
                boolean isAlternating1 = isAlternating(concatenatedString1);
                boolean isAlternating2 = isAlternating(concatenatedString2);

                // Display the results
                System.out.println("Concatenated String 1: " + concatenatedString1);
                System.out.println("Is Concatenated String 1 alternating? " + isAlternating1);

                System.out.println("Concatenated String 2: " + concatenatedString2);
                System.out.println("Is Concatenated String 2 alternating? " + isAlternating2);

                scanner.close();
            }

            // Function to check if a string is alternating
            public static boolean isAlternating(String str) {
                for (int i = 0; i < str.length() - 2; i++) {
                    if (str.charAt(i) == str.charAt(i + 2)) {
                        return false;
                    }
                }
                return true;
            }
        }
