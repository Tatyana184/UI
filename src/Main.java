import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {
    static JPanel panel = new JPanel ();//������� ������

    static int numberOfQuestion = 1;
    static int current = 0;
    public static void main(String[] args) {

       panel.setLayout(new GridBagLayout());//������ �������� ��� ������������
       GridBagConstraints gridConstraints = new GridBagConstraints();
           gridConstraints.gridx = 2;//  ������ ������� �� �����������
           gridConstraints.gridy = 0;//  ������ ������� �� ���������
           gridConstraints.gridwidth = 1; // // ������  �  ������
           gridConstraints.gridheight = 1; // // ������  �  ������

           gridConstraints.insets = new Insets(5, 180, 5, 7);
           gridConstraints.anchor = GridBagConstraints.PAGE_END; //����� ��������� ��������� � ����� ����������
           gridConstraints.fill = GridBagConstraints.HORIZONTAL;


        JFrame frame = new JFrame();//������� �����
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ ������ �� �����
        frame.setResizable(false);//��������� ����������� ��������� ��������
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//���������� ���������� ��������
        int width=1000, height=500;//������ ������ ����
        frame.setBounds(10, 10, width, height);//���������� ������� ����


        JLabel label = new JLabel();

        JTextField text = new JTextField();
        text.setHorizontalAlignment(JTextField.CENTER);

        text.setBorder(new LineBorder(Color.BLACK, 1));

        JButton button1 = new JButton();
        button1.setBorder(new LineBorder(Color.BLACK, 1));
        button1.setBackground(Color.LIGHT_GRAY);

        JButton button2 = new JButton();
        button2.setBorder(new LineBorder(Color.BLACK, 1));
        button2.setBackground(Color.LIGHT_GRAY);

        JButton button3 = new JButton();
        button3.setBorder(new LineBorder(Color.BLACK, 1));
        button3.setBackground(Color.LIGHT_GRAY);

        JButton button4 = new JButton();
        button4.setBorder(new LineBorder(Color.BLACK, 1));
        button4.setBackground(Color.LIGHT_GRAY);

        panel.add(label, gridConstraints); // ������� ������

           gridConstraints.anchor = GridBagConstraints.CENTER;
           gridConstraints.insets = new Insets(7, 7, 7, 7);
           gridConstraints.gridwidth = 2; // ���������� �����
           gridConstraints.ipadx = 400; // ������
           gridConstraints.ipady = 60; // ������
           gridConstraints.gridx = 1; // �������
           gridConstraints.gridy = 1; // ������
           panel.add(text, gridConstraints);

           gridConstraints.gridy = 2; // ������ ������
           gridConstraints.gridx = 1;

           gridConstraints.gridwidth = 1;// ���������� �����
           gridConstraints.ipadx = 200;// ������
           gridConstraints.ipady = 60;// ������
           panel.add(button1, gridConstraints);

           gridConstraints.gridx = 2;
           panel.add(button2, gridConstraints);

           gridConstraints.gridy = 3; // ������ ������
           gridConstraints.gridx = 1;
           panel.add(button3, gridConstraints);

            gridConstraints.gridx = 2;
            panel.add(button4, gridConstraints);

        frame.add(panel);//��������� ������ �� �����
      //  frame.pack();//������
        frame.setVisible(true);//������ ����� �������


       button1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

           }
       });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             if(numberOfQuestion == 1){
                 current += 1;
             }
              numberOfQuestion += 1;

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOfQuestion == 2){
                    current += 1;
                }
                numberOfQuestion += 1;

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOfQuestion == 3){
                    current += 1;
                }
                numberOfQuestion += 1;

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOfQuestion == 4 || numberOfQuestion == 5){
                    current += 1;
                }
                numberOfQuestion += 1;

            }
        });
        while(true){

            if(numberOfQuestion == 1){
                label.setText("������ " + numberOfQuestion+ "/5");
                text.setText("�������� �� �������� ����������� ��� ���� ���:");
                button1.setText("����������");
                button2.setText("������");
                button3.setText("�������");
                button4.setText("�����������");
            }
            else if(numberOfQuestion == 2) {
                label.setText("������ " + numberOfQuestion+ "/5");
                text.setText("����������, ���������� �� ��������� ��� ���������� ����� ��������:");
                button1.setText("������");
                button2.setText("��������");
                button3.setText("��������");
                button4.setText("����������");
            }
            else if(numberOfQuestion == 3){
                label.setText("������ " + numberOfQuestion+ "/5");
                text.setText("���������� ����� ���������� ������� �������� ��� ������:");
                button1.setText("������� �����");
                button2.setText("������� ��������");
                button3.setText("������� ������");
                button4.setText("������� ��������");
            }
            else if(numberOfQuestion == 4){
                label.setText("������ " + numberOfQuestion+ "/5");
                text.setText("��������� ����������� ������������ �����");
                button1.setText("������� ��������");
                button2.setText("������� ������");
                button3.setText("������� ��������");
                button4.setText("������� ���������");
            }
            else if(numberOfQuestion == 5){
                label.setText("������ " + numberOfQuestion+ "/5");
                text.setText("��� ����� 1 ����?");
                button1.setText("1024 �����");
                button2.setText("4 ���");
                button3.setText("10 �����");
                button4.setText("8 ���");

            }
            else if(numberOfQuestion == 6){
              int input = JOptionPane.showOptionDialog(frame,  "��� ���������: "+ current + " �� 5","Message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

                if(input == JOptionPane.OK_OPTION)
                {
                    System.exit(1);
                }
            }
        }

    }

}