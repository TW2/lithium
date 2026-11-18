package lithium;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Lithium extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            FlatLightLaf.setup();
            Lithium lit = new Lithium();
            lit.setLocationRelativeTo(null);
            lit.setVisible(true);
        });
    }

    public Lithium(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1900, 1000);
        setTitle("Lithium 0.1");
    }
}
