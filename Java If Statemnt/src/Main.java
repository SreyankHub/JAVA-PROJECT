import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("What Is The Code:");
        int input = scanner.nextInt();

        String password = "Akansha88";
        if(input == Integer.parseInt("12345")) {
            System.out.println("Correct Answer!");
            System.out.println("The Password Is = "+password);
        }

        else {
            System.out.println("You Are Wrong!!");
        }
    }
}
