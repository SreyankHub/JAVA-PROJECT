import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //New JFrame Object and its configs
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,3,10,10));
        frame.setSize(500,500);

        //adding button to the frame(in an easier way to save time)
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("0"));

        //lastly, to show the frame
        frame.setVisible(true);


    }
}
