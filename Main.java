import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input for the year
        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        // Check if the entered year is a 4-digit number
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4-digit number for the year.");
            return;
        }

        // Check if it is a leap year
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

    }
}