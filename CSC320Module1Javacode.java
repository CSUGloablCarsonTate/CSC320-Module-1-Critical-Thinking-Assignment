import java.util.Scanner;

public class CSC320Module1Javacode {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Collect personal information from the user
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your street address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your ZIP code: ");
        String zipCode = scanner.nextLine();

        // Call the method to display personal information
        displayInformation(firstName, lastName,
                           streetAddress, city, zipCode);

        // Close the Scanner
        scanner.close();
    }

    // Reusable method to display personal information
    public static void displayInformation(
            String firstName,
            String lastName,
            String streetAddress,
            String city,
            String zipCode) {

        System.out.println();
        System.out.println("===== PERSONAL INFORMATION =====");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("ZIP Code: " + zipCode);
        System.out.println("================================");
    }
}