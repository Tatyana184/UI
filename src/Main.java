import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {
    static JPanel panel = new JPanel ();//создаем панель
    static String str; // храним содержимое строки ввода
    static String op;
   static double result;

       public static void main(String[] args) {


        panel.setLayout(new GridBagLayout());//задаем менеджер дл€ выравнивани€

           GridBagConstraints gridConstraints = new GridBagConstraints();

           gridConstraints.gridx = 0;// нулева€ €чейка таблицы по горизонтали
           gridConstraints.gridy = 0;// нулева€ €чейка таблицы по вертикали
           gridConstraints.gridwidth = 4; // // размер кнопки в  €чейки
           gridConstraints.gridheight = 1; // // размер кнопки в  €чейки
           gridConstraints.weightx = 50; // интервал
           gridConstraints.weighty = 100;// интервал
           gridConstraints.insets = new Insets(5, 5, 5, 5);
           gridConstraints.anchor = GridBagConstraints.CENTER; //„тобы поместить компонент в центр контейнера
           gridConstraints.fill = GridBagConstraints.HORIZONTAL;


        JFrame frame = new JFrame();//создаем форму
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setSize(500, 500);//выставл€ем размеры окна

           JTextField textField = new JTextField();

           JButton one = new JButton("1");
           JButton two = new JButton("2");
           JButton  three = new JButton("3");
           JButton four = new JButton("4");
           JButton five = new JButton("5");
           JButton six = new JButton("6");
           JButton seven = new JButton("7");
           JButton eight = new JButton("8");
           JButton nine = new JButton("9");
           JButton zero = new JButton("0");
           JButton minus = new JButton("-");
           JButton delete = new JButton("C");
           JButton plus = new JButton("+");
           JButton division = new JButton("/");
           JButton multiply = new JButton("*");
           JButton button = new JButton("=");

           panel.add(textField, gridConstraints); // нулева€ строка

           gridConstraints.gridy = 1; // перва€ строка

           gridConstraints.gridwidth = 1;
           panel.add(one, gridConstraints);
           gridConstraints.gridx = 1;
           panel.add(two, gridConstraints);
           gridConstraints.gridx = 2;
           panel.add(three, gridConstraints);
           gridConstraints.gridx = 3;
           panel.add(plus, gridConstraints);

           gridConstraints.gridy = 2; // втора€ строка

           gridConstraints.gridx = 0;
           panel.add(four, gridConstraints);
           gridConstraints.gridx = 1;
           panel.add(five, gridConstraints);
           gridConstraints.gridx = 2;
           panel.add(six, gridConstraints);
           gridConstraints.gridx = 3;
           panel.add(minus, gridConstraints);

           gridConstraints.gridy = 3; // треть€ строка

           gridConstraints.gridx = 0;
           panel.add(seven, gridConstraints);
           gridConstraints.gridx = 1;
           panel.add(eight, gridConstraints);
           gridConstraints.gridx = 2;
           panel.add(nine, gridConstraints);
           gridConstraints.gridx = 3;
           panel.add(multiply, gridConstraints);


           gridConstraints.gridy = 4; // четверта€

           gridConstraints.gridx = 0;
           panel.add(delete, gridConstraints);
           gridConstraints.gridx = 1;
           panel.add(zero, gridConstraints);
           gridConstraints.gridx = 2;
           panel.add(button, gridConstraints);
           gridConstraints.gridx = 3;
           panel.add(division, gridConstraints);


        button.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку =
            @Override
            public void actionPerformed(ActionEvent e) {
                str = textField.getText();
                String[] mass = str.split(op);

                try{

                    double a = Double.valueOf(mass[0]);
                    double b = Double.valueOf(mass[1]);

                    Calculate(a,b);

                }catch(Exception exception){
                    System.out.println("Error! Not number");
                }
            }

            private void Calculate(double a, double b) {

                    switch (op){
                        case "\\+":
                           result = a+b;
                            textField.setText(String.valueOf(result));
                            break;
                        case "\\-":
                            result = a-b;
                            textField.setText(String.valueOf(result));
                            break;
                        case "\\/":
                            if(b == 0){
                                textField.setText("Error! Division by zero");
                            } else {
                                result = a/b;
                            textField.setText(String.valueOf(result));
                            }
                            break;
                        case "\\*":
                            result = a*b;
                            textField.setText(String.valueOf(result));
                            break;
                        default:

                            textField.setText("Operation Error!");
                            break;
                    }

                }

        });
           zero.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 0
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "0");
               }
           });
           one.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 1
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "1");
               }
           });
           two.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 2
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "2");
               }
           });
           three.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 3
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "3");
               }
           });
          four.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 4
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "4");
               }
           });
           five.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 5
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "5");
               }
           });
           six.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 6
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "6");
               }
           });
          seven.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 7
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "7");
               }
           });
           eight.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 8
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "8");
               }
           });
           nine.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку 9
               @Override
               public void actionPerformed(ActionEvent e) {
                   textField.setText(textField.getText() + "9");
               }
           });
           minus.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку -
               @Override
               public void actionPerformed(ActionEvent e) {
                   op = "\\-";
                   textField.setText(textField.getText() + "-");
               }
           });
           plus.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку +
               @Override
               public void actionPerformed(ActionEvent e) {
                   op = "\\+";
                   textField.setText(textField.getText() + "+");
               }
           });
          multiply.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку *
               @Override
               public void actionPerformed(ActionEvent e) {
                   op = "\\*";
                   textField.setText(textField.getText() + "*");
               }
           });
           division.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку /
               @Override
               public void actionPerformed(ActionEvent e) {
                   op = "\\/";
                   textField.setText(textField.getText() + "/");
               }
           });
           delete.addActionListener(new ActionListener() { //добавл€ем слушател€ на кнопку C
               @Override
               public void actionPerformed(ActionEvent e) {
                  textField.setText(null);
               }
           });
        frame.add(panel);//добавл€ем панель на форму
        frame.pack();//пакуем
        frame.setVisible(true);//делаем форму видимой
    }
}