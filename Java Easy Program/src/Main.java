
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        String str= "Sreyank", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Sreyank"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);


    }
}
