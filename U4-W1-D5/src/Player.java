import entities.AudioRecording;
import entities.Image;
import entities.MultimediaItem;
import entities.Video;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        MultimediaItem[] elements = new MultimediaItem[1];
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Playing Ground Theme - Super Mario Bros. in background...*");
        System.out.println("Hello welcome in our player!");

        //-------------------------------Initializing objects of array--------------------------------------
        for (int i = 0; i < 1; i++){
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

        System.out.println("Now, you have created a playlist with your multimedia items created before.");
        int choice;
        do {
            System.out.println("If you want to execute your multimedia, insert a number from 1 to 5 (or 0 to exit):");
             choice = Integer.parseInt(scanner.nextLine());

            if (choice >= 1 && choice <= 5) {
                MultimediaItem itemChosen = elements[choice - 1];

                if (itemChosen instanceof AudioRecording) {
                    System.out.println("Playing audio...");
                    ((AudioRecording) itemChosen).play();
                    //----------TURN UP/DOWN VOLUME AUDIO -----------
                    System.out.println("Do you want to turn up the volume? Answer Y/N");
                    String answer = scanner.nextLine().toUpperCase();
                    if( answer.equals("Y")) {
                        ((AudioRecording) itemChosen).turnUpVolume();
                        ((AudioRecording) itemChosen).play();
                    }
                    System.out.println("Do you want to turn down the volume? Answer Y/N");
                    String answerTwo = scanner.nextLine().toUpperCase();
                    if( answerTwo.equals("Y")) {
                        ((AudioRecording) itemChosen).turnDownVolume();
                        ((AudioRecording) itemChosen).play();
                    }
                   //--------------SET VOLUME AUDIO:---------------
                    System.out.println("Do you want to set manually the volume? Answer Y/N");
                    String answerSet = scanner.nextLine().toUpperCase();
                    if(answerSet.equals("Y")) {
                        System.out.println("Insert a new value for the volume as integer:");
                        int volume = Integer.parseInt(scanner.nextLine());
                        ((AudioRecording) itemChosen).setVolume(volume);
                        ((AudioRecording) itemChosen).play();
                    }

                } else if (itemChosen instanceof Video) {
                    ((Video) itemChosen).play();
                } else if (itemChosen instanceof Image) {
                    ((Image) itemChosen).show();
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please enter a number from 1 to 5 (or 0 to exit).");
            }
        } while (choice != 0);


    }
}
