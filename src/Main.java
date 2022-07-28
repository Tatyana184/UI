import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//���������� ���������� ��������
        int width=700, height=700;//������ ������ ����
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);//���������� ������� ����



        String[] colors = {"�������","�������","������"};

        JComboBox comboBox = new JComboBox(colors);
        JCheckBox checkBox = new JCheckBox("���� �������");
        JTextField textField = new JTextField();
        JButton btn = new JButton("�������� ");
        JLabel label = new JLabel();

        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//������ �������� ��� ������������
        panel.add(Box.createVerticalStrut(20));//����� ������������ ��������� ������ ����������
        panel.add(comboBox);
        panel.add(Box.createVerticalStrut(20));
        panel.add(checkBox);
        panel.add(Box.createVerticalStrut(20));
        panel.add(textField);
        panel.add(Box.createVerticalStrut(20));
        panel.add(btn);
        panel.add(Box.createVerticalStrut(20));
        panel.add(label);
        panel.add(Box.createVerticalStrut(20));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);



            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(checkBox.isSelected()){

                        label.setText("�����: " + textField.getText());
                    }
                    else {
                        label.setText("�����: " + comboBox.getSelectedItem());
                    }
                }
            });

    }
}