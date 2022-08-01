import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {
    static JPanel panel = new JPanel ();//создаем панель


    static void addObject(JComponent o, int n, float alignmentX){//метод добавления объектов на панель
        o.setAlignmentX(alignmentX);//устанавливаем горизонтальное выравнивание
        panel.add(o);//добавляем объект на панель
        if (n>0) panel.add(Box.createVerticalStrut(n));//добавляем пустой промежуток после него, если он задан
    };

    public static void main(String[] args) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//задаем менеджер для выравнивания
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));//расширяем границы панели, чтобы элементы не прижимались вплотную к границе

        JFrame frame = new JFrame();//создаем форму
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setSize(1500, 1500);//выставляем размеры окна

        JTextField textField = new JTextField();
        addObject(textField,10,Component.CENTER_ALIGNMENT);
        JButton button = new JButton("Записать");
        addObject(button,10,Component.CENTER_ALIGNMENT);
        JTextArea text = new JTextArea();
        text.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        addObject(scrollPane,10,Component.CENTER_ALIGNMENT);

        button.addActionListener(new ActionListener() {//добавляем слушателя на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append(textField.getText()+ "\n");//считываем значение из радиобаттона
            }
        });

        frame.add(panel);//добавляем панель на форму
        frame.pack();//пакуем
        frame.setVisible(true);//делаем форму видимой
    }
}