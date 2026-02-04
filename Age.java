public class Age {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = 2026;
        int age = currentYear - birthYear;
        System.out.println("Age: " + age);
        scanner.close();
    }
}
