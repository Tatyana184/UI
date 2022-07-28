import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel("Моя первая надпись!");
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        label.setVerticalAlignment(JLabel.TOP);

        JOptionPane.showMessageDialog(frame,label);
    }
}