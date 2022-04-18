import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JLabel text = new JLabel();
        text.setText("Math Application");

        JButton button1 = new JButton();
        button1.setText("1");
        button1.setBounds(10,100,50,50);
        button1.addActionListener(x -> System.out.print(1));

        JButton button2 = new JButton();
        button2.setBounds(60,100,50,50);
        button2.setText("2");
        button2.addActionListener(x -> System.out.print(2));

        JButton button3 = new JButton();
        button3.setBounds(110,100,50,50);
        button3.setText("3");
        button3.addActionListener(x -> System.out.print(3));

        JButton button4 = new JButton();
        button4.setBounds(160,100,50,50);
        button4.setText("4");
        button4.addActionListener(x -> System.out.print(4));

        JButton button5 = new JButton();
        button5.setBounds(210,100,50,50);
        button5.setText("5");
        button5.addActionListener(x -> System.out.print(5));

        JButton button6 = new JButton();
        button6.setBounds(260,100,50,50);
        button6.setText("6");
        button6.addActionListener(x -> System.out.print(6));

        JButton button7 = new JButton();
        button7.setBounds(310,100,50,50);
        button7.setText("7");
        button7.addActionListener(x -> System.out.print(7));

        JButton button8 = new JButton();
        button8.setBounds(360,100,50,50);
        button8.setText("8");
        button8.addActionListener(x -> System.out.print(8));

        JButton button9 = new JButton();
        button9.setBounds(410,100,50,50);
        button9.setText("9");
        button9.addActionListener(x -> System.out.print(9));

        JButton button10 = new JButton();
        button10.setBounds(460,100,50,50);
        button10.setText("10");
        button10.addActionListener(x -> System.out.print(10));

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(536,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setSize(100,100);
        panel1.setBackground(Color.CYAN);
        panel1.add(text);

        panel2.setSize(100,100);
        panel2.setBackground(Color.blue);

        panel3.setSize(100,100);
        panel3.setBackground(Color.GRAY);

        panel4.setSize(100,100);
        panel4.setBackground(Color.GREEN);

        panel5.setSize(100,100);
        panel5.setBackground(Color.BLACK);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.EAST);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);





    }
}
