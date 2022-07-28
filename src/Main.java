import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

   static int count = 0;
    public static void main(String[] args) {
        JFrame f= new JFrame();

        f.setVisible(true);
        f.setSize(200,200);
        Container c = f.getContentPane();
        c.setLayout(null);
        JButton btn=new JButton("Ответить ");
        JLabel label = new JLabel();
        String[] num = {"1","2","3","4","5","6","7","8","9","10"};
        JSpinner spinner = new JSpinner(new SpinnerListModel(num));

        spinner.setBounds(40,10,100,20);
        btn.setBounds(40,50,100,20);
        label.setBounds(50,100,100,20);

        f.add(btn);
        f.add(label);
        f.add(spinner);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Ответ: " + spinner.getValue());

            }
        });

    }
}