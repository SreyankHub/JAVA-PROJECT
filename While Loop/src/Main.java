import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      String input = "";

      while(input.isBlank()) {

          System.out.print("What is Your name:");
          input = scanner.nextLine();
      }

        System.out.print("You Have Escaped The Wile Loop:");
        System.out.print(input);

    }
}
