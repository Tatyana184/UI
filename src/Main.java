import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {
    static JPanel panel = new JPanel ();//������� ������


    static void addObject(JComponent o, int n, float alignmentX){//����� ���������� �������� �� ������
        o.setAlignmentX(alignmentX);//������������� �������������� ������������
        panel.add(o);//��������� ������ �� ������
        if (n>0) panel.add(Box.createVerticalStrut(n));//��������� ������ ���������� ����� ����, ���� �� �����
    };

    public static void main(String[] args) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//������ �������� ��� ������������
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));//��������� ������� ������, ����� �������� �� ����������� �������� � �������

        JFrame frame = new JFrame();//������� �����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ ������ �� �����
        frame.setSize(1500, 1500);//���������� ������� ����

        JTextField textField = new JTextField();
        addObject(textField,10,Component.CENTER_ALIGNMENT);
        JButton button = new JButton("��������");
        addObject(button,10,Component.CENTER_ALIGNMENT);
        JTextArea text = new JTextArea();
        text.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        addObject(scrollPane,10,Component.CENTER_ALIGNMENT);

        button.addActionListener(new ActionListener() {//��������� ��������� �� ������
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append(textField.getText()+ "\n");//��������� �������� �� ������������
            }
        });

        frame.add(panel);//��������� ������ �� �����
        frame.pack();//������
        frame.setVisible(true);//������ ����� �������
    }
}