import javax.lang.model.type.NullType;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {

        String Name = JOptionPane.showInputDialog("What Is Your Name?");
    int Age = Integer.parseInt(JOptionPane.showInputDialog("What Is Your Age?"));
    JOptionPane.showMessageDialog(null,"Hello "+Name+", Your Age Is "+Age);



    }
}
