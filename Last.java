public class Last {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            char lastChar = input.charAt(input.length() - 1);
            System.out.println("Last character: '" + lastChar + "'");
        } else {
            System.out.println("String is empty.");
        }
        scanner.close();
    }
}
