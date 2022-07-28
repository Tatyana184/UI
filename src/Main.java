import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

   static int count = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel("Количество нажатий: " + count);
        JButton button = new JButton();
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());


        frame.add(label,BorderLayout.PAGE_START);
        frame.add(button,BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count += 1;
                label.setText("Количество нажатий: " + count);

            }
        });

    }
}