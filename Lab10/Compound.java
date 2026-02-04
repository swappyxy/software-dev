import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        number += 2;
        System.out.println("After adding 2: " + number);
        number -= 5;
        System.out.println("After subtracting 5: " + number);

    }
}
