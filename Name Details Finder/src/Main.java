import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("What Is Your Name?");
        name = scanner.nextLine();

        System.out.println("length:"+name.length());
        System.out.println("ToLowerCase:"+name.toLowerCase());
        System.out.println("ToUpperCase:"+name.toUpperCase());



    }
}
