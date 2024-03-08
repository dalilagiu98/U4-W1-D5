import entities.AudioRecording;
import entities.Image;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //AUDIO RECORDS

//        System.out.println("Insert a title, a volume and duration");
//        String title = scanner.nextLine();
//        int volume = Integer.parseInt(scanner.nextLine());
//        int duration = Integer.parseInt(scanner.nextLine());
//        AudioRecording audio = new AudioRecording(title, volume, duration);
//        System.out.println("Playing song...");
//        audio.play();
//        System.out.println("Do you want to turn up the volume? Answer Y/N");
//        String answer = scanner.nextLine().toUpperCase();
//        if( answer.equals("Y")) {
//            audio.turnUpVolume();
//            audio.play();
//        }
//        System.out.println("Do you want to turn down the volume? Answer Y/N");
//        String answerTwo = scanner.nextLine().toUpperCase();
//        if( answerTwo.equals("Y")) {
//            audio.turnDownVolume();
//            audio.play();
//        }

        //VIDEO:

//        System.out.println("Insert a title, volume, brightness and duration");
//        String title = scanner.nextLine();
//        int volume = Integer.parseInt(scanner.nextLine());
//        int duration = Integer.parseInt(scanner.nextLine());
//        int brightness = Integer.parseInt(scanner.nextLine());
//        Video video = new Video(title, volume, duration, brightness);
//        System.out.println("Playing video...");
//        video.play();
//        System.out.println("Do you want to turn up the volume? Answer Y/N");
//        String answer = scanner.nextLine().toUpperCase();
//        if (answer.equals("Y")) {
//            video.turnUpVolume();
//            video.play();
//        }
//        System.out.println("Do you want to turn down the volume? Answer Y/N");
//        String answerTwo = scanner.nextLine().toUpperCase();
//        if (answerTwo.equals("Y")) {
//            video.turnDownVolume();
//            video.play();
//        }


        //IMAGE:
        System.out.println("Insert a title and a brightness:");
        String title = scanner.nextLine();
        int brightness = Integer.parseInt(scanner.nextLine());
        Image image = new Image(title, brightness);
        System.out.println("Showing image...");
        image.show();
    }
}