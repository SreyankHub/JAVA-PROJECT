import java.util.Scanner;
public class Brand extends Mouse{

    //Overriding the abstract method
    @Override
    void Mouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Mouse Do You Want");
        String Mouse = scanner.nextLine();

        System.out.printf("\n"+"You Want the %s ",Mouse);


    }
}
