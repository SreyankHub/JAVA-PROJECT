//importing an exception (InputMismatchException)
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Scanner Class
         Scanner scanner = new Scanner(System.in);

         //trying the dangerous code
        try {
            System.out.println("What Is Your Age?");
            int x = scanner.nextInt();

            System.out.println("Your Age Is " + x);
        }
        //catching the exceptions
        catch (InputMismatchException e) {
            System.out.println("That Is Not a Age,Try Again");
        }
        //using finally block to close scanner
        finally {
            scanner.close();
        }



    }
}
