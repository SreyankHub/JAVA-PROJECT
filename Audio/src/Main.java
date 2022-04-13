//imports
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //Creating Objects
        Scanner scanner = new Scanner(System.in);
        File file = new File("Audio.wav");
        //creating a audio input stream
        AudioInputStream inputstream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        //Playing The Sound
        clip.open(inputstream);
        clip.start();

        //making a input block to keep the song running until we give input
        String end = scanner.nextLine();


    }
}
