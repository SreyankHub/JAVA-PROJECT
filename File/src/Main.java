import java.io.File;
public class Main {

    public static void main(String[] args) {

        //new File Class
        File file1 = new File("HelloFile.txt");

        //if statements with booleans to print if the file exists or not
        if (file1.exists()) {
            System.out.println("This File exists! " + file1.toString());
        }

        //same
        else {
            System.out.println("This File Does Not Exist " + file1.toString());
        }




    }

}
