import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number you Want To Substract or Add");
        int FirstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Number you Want To Substract or Add");
        int SecondNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Number you Want To Substract Add");
        int ThirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(Substraction(FirstNum,SecondNum));
        System.out.println(Addition(FirstNum,SecondNum,ThirdNum));
    }



    static int Addition(int First,int Second) {
        System.out.println("Your Addition of two numbers Will Be:");
        return First+Second;
    }

    static int Substraction(int First,int Second) {
        System.out.println("Your Substracted Answer Will Be:");
        return First-Second;
    }

    static int Addition(int First,int Second,int Third) {
        System.out.println("Your Addition of Three Numbers will be:");
        return First + Second + Third;

    }


}
