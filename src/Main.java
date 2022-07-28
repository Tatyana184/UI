import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel("Моя первая надпись!");
        label.setVerticalAlignment(JLabel.TOP);

        String[] size = {"10","20","30","40"};
        JComboBox comboBox = new JComboBox(size);
         int check = JOptionPane.showConfirmDialog(
                frame,  comboBox, "Выберите размер шрифта",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    if(check == JOptionPane.OK_OPTION) {


            int sizeText = Integer.parseInt((String) comboBox.getSelectedItem());

            label.setFont(new Font("Verdana", Font.PLAIN, sizeText));

}
        JOptionPane.showMessageDialog(frame, label);
    }
}