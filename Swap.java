import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();
        System.out.println("Strings before swap: a = " + a + " and b = " + b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("Strings after swap: a = " + a + " and b = " + b);
    }
}
