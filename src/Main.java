import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {
    static JPanel panel = new JPanel ();//создаем панель

    static int numberOfQuestion = 1;
    static int current = 0;
    public static void main(String[] args) {

       panel.setLayout(new GridBagLayout());//задаем менеджер для выравнивания
       GridBagConstraints gridConstraints = new GridBagConstraints();
           gridConstraints.gridx = 2;//  ячейка таблицы по горизонтали
           gridConstraints.gridy = 0;//  ячейка таблицы по вертикали
           gridConstraints.gridwidth = 1; // // размер  в  ячейки
           gridConstraints.gridheight = 1; // // размер  в  ячейки

           gridConstraints.insets = new Insets(5, 180, 5, 7);
           gridConstraints.anchor = GridBagConstraints.PAGE_END; //Чтобы поместить компонент в конец контейнера
           gridConstraints.fill = GridBagConstraints.HORIZONTAL;


        JFrame frame = new JFrame();//создаем форму
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setResizable(false);//отключаем возможность изменения размеров
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        int width=1000, height=500;//задаем размер окна
        frame.setBounds(10, 10, width, height);//выставляем размеры окна


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

        panel.add(label, gridConstraints); // нулевая строка

           gridConstraints.anchor = GridBagConstraints.CENTER;
           gridConstraints.insets = new Insets(7, 7, 7, 7);
           gridConstraints.gridwidth = 2; // занимаемое место
           gridConstraints.ipadx = 400; // ширина
           gridConstraints.ipady = 60; // высота
           gridConstraints.gridx = 1; // столбец
           gridConstraints.gridy = 1; // строка
           panel.add(text, gridConstraints);

           gridConstraints.gridy = 2; // вторая строка
           gridConstraints.gridx = 1;

           gridConstraints.gridwidth = 1;// занимаемое место
           gridConstraints.ipadx = 200;// ширина
           gridConstraints.ipady = 60;// высота
           panel.add(button1, gridConstraints);

           gridConstraints.gridx = 2;
           panel.add(button2, gridConstraints);

           gridConstraints.gridy = 3; // третья строка
           gridConstraints.gridx = 1;
           panel.add(button3, gridConstraints);

            gridConstraints.gridx = 2;
            panel.add(button4, gridConstraints);

        frame.add(panel);//добавляем панель на форму
      //  frame.pack();//пакуем
        frame.setVisible(true);//делаем форму видимой


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
                label.setText("Вопрос " + numberOfQuestion+ "/5");
                text.setText("Сведения об объектах окружающего нас мира это:");
                button1.setText("информация");
                button2.setText("объект");
                button3.setText("предмет");
                button4.setText("информатика");
            }
            else if(numberOfQuestion == 2) {
                label.setText("Вопрос " + numberOfQuestion+ "/5");
                text.setText("Информацию, изложенную на доступном для получателя языке называют:");
                button1.setText("полной");
                button2.setText("понятной");
                button3.setText("полезной");
                button4.setText("актуальной");
            }
            else if(numberOfQuestion == 3){
                label.setText("Вопрос " + numberOfQuestion+ "/5");
                text.setText("Наибольший объем информации человек получает при помощи:");
                button1.setText("органов слуха");
                button2.setText("органов обоняния");
                button3.setText("органов зрения");
                button4.setText("органов осязания");
            }
            else if(numberOfQuestion == 4){
                label.setText("Вопрос " + numberOfQuestion+ "/5");
                text.setText("Измерение температуры представляет собой");
                button1.setText("процесс хранения");
                button2.setText("процесс защиты");
                button3.setText("процесс передачи");
                button4.setText("процесс получения");
            }
            else if(numberOfQuestion == 5){
                label.setText("Вопрос " + numberOfQuestion+ "/5");
                text.setText("Что такое 1 байт?");
                button1.setText("1024 Кбайт");
                button2.setText("4 бит");
                button3.setText("10 Мбайт");
                button4.setText("8 бит");

            }
            else if(numberOfQuestion == 6){
              int input = JOptionPane.showOptionDialog(frame,  "Ваш результат: "+ current + " из 5","Message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

                if(input == JOptionPane.OK_OPTION)
                {
                    System.exit(1);
                }
            }
        }

    }

}