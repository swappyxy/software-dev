import java.util.Scanner;
public class iterations {
    public static void main(String[] args) {
        // System.out.println("line of text");
        Scanner input = new Scanner(System.in);
        int number;
        String output ="";

        int i=1;
        while (i<=3){
            System.out.println("Enter number "+i+":");
            number = input.nextInt();
            output += number + "";
            String result = ", ";
            i++;
            
        }
        output = output.substring(0, output.length()-2);
        System.out.println("numbers entered are:"+output);
        input.close();
    }
    }

