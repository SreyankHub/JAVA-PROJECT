import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what day is today:");
        String answer = scanner.nextLine();

        switch(answer) {
            case "Sunday":
                System.out.println("its Sunday!!");
                break;
            case "Monday":
                System.out.println("Its Monday!!");
                break;
            case "Tuesday":
                System.out.println("its Monday!!");
                break;
            case "Wednesday":
                System.out.println("its wednesday!!");
                break;
            case "Thursday":
                System.out.println("its Thursday!!");
                break;
            case "Friday":
                System.out.println("its Friday!!");
                break;
            case "Saturday":
                System.out.println("its Saturday!!");
                break;
            default:
                System.out.println("Check What Are You Typing");



        }

    }
}
