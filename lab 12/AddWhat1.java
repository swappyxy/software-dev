import java.util.Scanner;

public class AddWhat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int updatedNumber;

        if (number > 20) {
            updatedNumber = number + 2;
        } else if (number > 10) {
            updatedNumber = number + 3;
        } else {
            updatedNumber = number + 1;
        }

        System.out.println("Number updated to: " + updatedNumber);
        scanner.close();
    }
}
