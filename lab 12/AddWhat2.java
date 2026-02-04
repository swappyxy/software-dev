import java.util.Scanner;
public class AddWhat2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result;
        if (num > 100) {
            result = num * 10;
        } else if (num > 75) {
            result = num * 8;
        } else if (num > 50) {
            result = num * 6;
        } else if (num > 25) {
            result = num * 4;
        } else {
            result = num / 2;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
