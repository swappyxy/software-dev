import java.util.Scanner;
public class AddWhat3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result;
        if (num > 100) {
            result = num + 10;
        } else if (num <= 100|| num > 50) {
            result = num + 5;
        } else if (num > 20|| num <= 50) {
            result = num +2 ;
        } else if (num <= 20) {
            result = num + 1;   
            
        } else
            {
            result = num / 2;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
