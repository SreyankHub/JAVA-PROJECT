import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {



        //JFrame objects
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //how to add flow layout
        frame.setLayout(new FlowLayout());

        //new JButton Objects and there configs
        JButton button1 = new JButton();
        button1.setText("1");
        button1.setSize(new Dimension(50,50));
        JButton button2 = new JButton();
        button2.setText("2");
        button2.setSize(new Dimension(50,50));
        JButton button3 = new JButton();
        button3.setText("3");
        button3.setSize(new Dimension(50,50));
        JButton button4 = new JButton();
        button4.setText("4");
        button4.setSize(new Dimension(50,50));
        JButton button5 = new JButton();
        button5.setText("5");
        button5.setSize(new Dimension(50,50));
        JButton button6 = new JButton();
        button6.setText("6");
        button6.setSize(new Dimension(50,50));
        JButton button7 = new JButton();
        button7.setText("7");
        button7.setSize(new Dimension(50,50));
        JButton button8 = new JButton();
        button8.setText("8");
        button8.setSize(new Dimension(50,50));
        JButton button9 = new JButton();
        button9.setText("9");
        button9.setSize(new Dimension(50,50));
        JButton button0 = new JButton();
        button0.setText("0");
        button0.setSize(new Dimension(50,50));

        //adding the objects
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);


        frame.setVisible(true);

    }
}
