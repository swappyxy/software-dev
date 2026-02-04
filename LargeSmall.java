import java.util.Scanner;
import javax.swing.JOptionPane;
public class LargeSmall {
    public static void main(String[] args) {
        // LargeSmallLogic.processNumbers(new Scanner(System.in));
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        JOptionPane.showMessageDialog(null, "You entered: " + num);
        
    }
    
}
