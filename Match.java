public class Match {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("The strings match.");
        } else {
            System.out.println("The strings do not match.");
        }

        scanner.close();
    }
}
