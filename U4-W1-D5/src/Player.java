import entities.AudioRecording;
import entities.Image;
import entities.MultimediaItem;
import entities.Video;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        MultimediaItem[] elements = new MultimediaItem[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Playing Ground Theme - Super Mario Bros. in background...*");
        System.out.println("Hello welcome in our player!");

        //-------------------------------Initializing objects of array--------------------------------------
        for (int i = 0; i < 5; i++){
            System.out.println("Please insert the type of the element you want to create: 1 -> audio recoding; 2 -> video; 3 -> image");
            int type = Integer.parseInt(scanner.nextLine());
            System.out.println("Now please insert the title of the element you want to create:");
            String title = scanner.nextLine();

            switch(type) {
                case 1:
                    System.out.println("You have chosen the Audio Recording type");
                    System.out.println("Please enter the duration as an integer:");
                    int durationAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the volume as an integer:");
                    int volumeAudio =Integer.parseInt(scanner.nextLine());
                    elements[i] = new AudioRecording(title, volumeAudio, durationAudio);
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    System.out.println("You have chosen the Video type");
                    System.out.println("Please enter the duration as an integer:");
                    int durationVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the volume as an integer:");
                    int volumeVideo =Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the brightness as an integer:");
                    int brightnessVideo =Integer.parseInt(scanner.nextLine());
                    elements[i] = new Video(title, volumeVideo, brightnessVideo, durationVideo);
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("You have chosen the Image type");
                    System.out.println("Please enter the brightness as an integer:");
                    int brightnessImage = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Image(title, brightnessImage);
                    System.out.println("------------------------------------------------");
                    break;
                default:
                    System.out.println("You have insert a wrong type! Insert 1, 2 or 3!");
                    i--; //to repeat the operation!
            }
        }


        //---------------------------------------Execution of the elements:------------------------------------

        

    }
}