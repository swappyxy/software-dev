import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class liqglass extends JFrame {
    public liqglass() {
        setTitle("Жидкое стекло");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        // Эффект жидкого стекла (полупрозрачность)
        setBackground(new Color( 150, 0, 150, 200 ));

        // Кнопка закрытия
        JButton closeBtn = new JButton("Закрыть");
        closeBtn.addActionListener(e -> dispose());

        setLayout(new BorderLayout());
        add(closeBtn, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            liqglass window = new liqglass();
            window.setVisible(true);
        });
    }
}
