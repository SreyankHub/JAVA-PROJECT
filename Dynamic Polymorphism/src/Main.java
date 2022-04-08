//import Scanner
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Scanner Object
        Scanner scanner = new Scanner(System.in);
        //human object
        human human;

        //printing a question
        System.out.println("Are You A Boy Or Girl"+"\n"+"Type Boy If Boy and Girl If girl");
        //saving the answer from the user in a variable
        String boygirl = scanner.nextLine();

        //easy to understand if statement to show you are a girl/boy
        if(boygirl.equals("Boy")||boygirl.equals("boy")) {
            human human1 = new boy();
            human1.hello();
        }
        if(boygirl.equals("Girl")||boygirl.equals("girl")) {
            human human2 = new girl();
            human2.hello();
        }
    }
}
