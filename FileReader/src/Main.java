//importing exception
import java.io.FileNotFoundException;
import java.io.IOException;
//importing File Reader
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //new Object reader
        FileReader reader = new FileReader("Happy.txt");
        //storing the data inside an int Variable
        int data = reader.read();
        //Creating a code with a while loop to print the characters not int
        while(data != -1) {
            System.out.print((char)data);
            data = reader.read();
        }
    }
}
