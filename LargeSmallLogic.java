import java.util.Scanner;

public class LargeSmallLogic {
    public static void processNumbers(Scanner scanner) {
        int large = 0, small = 0, number = 0, counter = 1;
        while (counter <= 5) {
            System.out.println("Enter number " + counter + ":");
            number = scanner.nextInt();
            if (number > 0) {
                if (number > large) {
                    large = number;
                }
                if (small == 0 || number < small) {
                    small = number;
                }
                counter++;
            } else {
                System.out.println("Please enter a positive number.");
            }
        }
        System.out.println("The largest number is: " + large);
        System.out.println("The smallest number is: " + small);
    }
}
