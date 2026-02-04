public class Change {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of 50 cent coins: ");
        int fiftyCent = scanner.nextInt();

        System.out.print("Enter the number of 20 cent coins: ");
        int twentyCent = scanner.nextInt();

        System.out.print("Enter the number of 10 cent coins: ");
        int tenCent = scanner.nextInt();

        System.out.print("Enter the number of 5 cent coins: ");
        int fiveCent = scanner.nextInt();

        double total = fiftyCent * 0.50 + twentyCent * 0.20 + tenCent * 0.10 + fiveCent * 0.05;

        System.out.println("\nTotal amount of money: " + total);
        scanner.close();
    }
}
