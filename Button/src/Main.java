//imports
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //Objects
        JFrame frame = new JFrame();
        JButton button = new JButton();

        //JButton Configs
        button.setBounds(200, 100, 200, 100);
        button.addActionListener(x -> System.out.println("Hello World"));
        button.setText("Hello World");
        button.setFocusPainted(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);

        //JFrame Configs
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(new Color(12, 32, 45));
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(button);

    }

}

