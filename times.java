import java.util.Scanner;
public class times {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, choice = 0, i = 1, max = 12;
        System.out.printf("Enter a number: ");
        num = input.nextInt();
        System.out.printf("1. add 2. multiply");
        choice = input.nextInt();
        if (choice == 1 || choice == 2) {
            while (i <= max) {
                if (choice ==1) {
                    System.out.println(num+" + " + i +" = "+(i+num));
                    
                }else{
                    System.out.println(num + " + " + i + " = " +(i*num));
                }
                i++;
            }
            
        }else{
            System.out.println("invalid choice");

        }input.close();
    }
}