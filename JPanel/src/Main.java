//imports
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        //new object
        JPanel panel1 = new JPanel();

        //panel1 configs
        panel1.setBounds(0,0,250,250);
        panel1.setBackground(Color.LIGHT_GRAY);

        //same to following

        JPanel panel2 = new JPanel();

        panel2.setBounds(250,0,250,250);
        panel2.setBackground(Color.BLUE);


        JPanel panel3 =new JPanel();

        panel3.setBounds(0,250,250,250);
        panel3.setBackground(Color.CYAN);

        JPanel panel4 = new JPanel();

        panel4.setBounds(250,250,250,250);
        panel4.setBackground(Color.MAGENTA);

        //JFrame object
        JFrame frame = new JFrame();
        //JFrame configs
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
       //adding the panels
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);



    }
}
