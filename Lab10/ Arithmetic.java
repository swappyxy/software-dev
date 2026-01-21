import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter five numbers
        System.out.print("Enter a number for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter a number for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter a number for c: ");
        int c = scanner.nextInt();
        
        System.out.print("Enter a number for d: ");
        int d = scanner.nextInt();
        
        System.out.print("Enter a number for e: ");
        int e = scanner.nextInt();
        
        // Perform calculations using compound assignment operators
        a += 9;  // Add 9 to a
        b -= 4;  // Subtract 4 from b
        c *= 3;  // Multiply c by 3
        d /= 2;  // Divide d by 2
        int remainder = e % 5;  // Calculate remainder of e divided by 5
        
        // Display results
        System.out.println("Value of a, 5, after adding 9 is: " + a);
        System.out.println("Value of b, 10, after subtracting 4 is: " + b);
        System.out.println("Value of c, 150, after multiplying by 3 is: " + c);
        System.out.println("Value of d, 4, after dividing by 2 is: " + d);
        System.out.println("Value of e, 12, after dividing e by 5: " + remainder);
        
        scanner.close();
    }
}